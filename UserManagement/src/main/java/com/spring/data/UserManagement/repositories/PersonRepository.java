package com.spring.data.UserManagement.repositories;

import com.spring.data.UserManagement.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
