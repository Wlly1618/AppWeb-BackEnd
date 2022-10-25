package com.apirest.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.apirest.demo.models.forUsers.Logs;

@RepositoryRestResource
public interface repLogs extends JpaRepository<Logs, Integer> {
    public ArrayList<Logs> findByAka(String aka);
}
