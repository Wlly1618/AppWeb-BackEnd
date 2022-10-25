package com.apirest.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.apirest.demo.models.forUsers.PersonalDetails;

@RepositoryRestResource
public interface repPersonalDetails extends JpaRepository<PersonalDetails, Integer> {
    
}
