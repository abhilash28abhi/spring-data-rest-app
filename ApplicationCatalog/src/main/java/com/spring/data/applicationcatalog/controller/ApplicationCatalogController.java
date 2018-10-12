package com.spring.data.applicationcatalog.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.data.applicationcatalog.domain.Application;
import com.spring.data.applicationcatalog.repositories.ApplicationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

import static org.springframework.hateoas.core.DummyInvocationUtils.methodOn;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@BasePathAwareController
@Slf4j
public class ApplicationCatalogController {

    @Autowired
    private ApplicationRepository applicationRepository;


    @RequestMapping(path = "applications", method = RequestMethod.GET, produces = "application/hal+json")
    public @ResponseBody
    ResponseEntity<?> getApplications() {
        List<Application> applications = applicationRepository.findAll();
        log.info("Application count: " + applications.size());
        applications.forEach(app -> getPersonInfo(app));
        Resources<Application> resources = new Resources<Application>(applications);
        resources.add(linkTo(methodOn(ApplicationCatalogController.class).getApplications()).withSelfRel());
        return ResponseEntity.ok(resources);
    }

    private void getPersonInfo(Application app) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String userManagementService = "http://localhost:8082/persons/" + app.getOwnerId();
            ResponseEntity<String> response = restTemplate.getForEntity(userManagementService, String.class);
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = null;
            root = mapper.readTree(response.getBody());
            JsonNode name = root.path("name");
            JsonNode role = root.path("role");
            app.setOwnerName(name.asText());
            app.setOwnerRole(role.asText());
        } catch (IOException e) {
            app.setOwnerRole("Undefined");
            app.setOwnerName("Undefined");
            e.printStackTrace();
        }

    }
}
