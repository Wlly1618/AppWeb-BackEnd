package com.apirest.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.apirest.demo.models.forUsers.User;

@RepositoryRestController
public interface repUser extends JpaRepository<User, Integer> {
    
}
