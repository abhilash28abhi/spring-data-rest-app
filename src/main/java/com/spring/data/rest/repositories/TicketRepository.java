package com.spring.data.rest.repositories;

import com.spring.data.rest.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//this will expose this repository on /bug endpoint instead of /tickets
// tickets endpoint is formed by appending s to the entity of repository
//@RepositoryRestResource(path = "bug")
//to hide the repository over http set exported = false in RepositoryRestResource
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
