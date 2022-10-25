package com.apirest.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.apirest.demo.models.others.Client;

@RepositoryRestResource
public interface repClient extends JpaRepository<Client, Integer> {
    
}
