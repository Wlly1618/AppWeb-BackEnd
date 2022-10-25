package com.apirest.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.demo.models.forUsers.Logs;
import com.apirest.demo.repositories.repLogs;

@Service
public class serLogs {
    
    @Autowired private repLogs rep;

    public Logs saveLog(Logs logs) {
        return rep.save(logs);
    }
}
