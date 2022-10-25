package com.apirest.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.apirest.demo.models.forTasks.Product;

@RepositoryRestResource
public interface repProduct extends JpaRepository<Product, Integer> {
    
}
