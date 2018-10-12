package com.spring.data.ticketmanagement.repositories;

import com.spring.data.ticketmanagement.domain.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

//this will expose this repository on /bug endpoint with HATEOAS links instead of /tickets
// tickets endpoint is formed by appending s to the entity name of repository
//@RepositoryRestResource(path = "bug")
//to hide the repository over http set exported = false in RepositoryRestResource
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    @RestResource(path = "descriptionIgnoreCaseContaining")
    public Page findByDescriptionIgnoreCaseContaining(@Param("description") String description, Pageable p);

    @RestResource(path = "findByApplicationId")
    public Page findByApplicationId(@Param("appId") Integer appId, Pageable p);

    @RestResource(path = "titleIgnoreCaseContaining")
    public Page findByTitleIgnoreCaseContaining(@Param("title") String title, Pageable p);
}
