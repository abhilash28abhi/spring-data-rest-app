package com.spring.data.UserManagement.bootstrap;

import com.spring.data.UserManagement.domain.Person;
import com.spring.data.UserManagement.repositories.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserManagementApplicationLoader implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Person person1 = new Person("Jane Doe", "Business Owner");
        Person person2 = new Person("Mary Doe", "Scrum Master");
        Person person3 = new Person("Kate Doe", "Developer");
        Person person4 = new Person("John Doe", "QA Tester");
        Person person5 = new Person("Mark Doe", "Business Analyst");
        personRepository.save(person1);
        personRepository.save(person2);
        personRepository.save(person3);
        personRepository.save(person4);
        personRepository.save(person5);
    }
}
