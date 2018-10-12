package com.spring.data.applicationcatalog.repositories;

import com.spring.data.applicationcatalog.domain.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
