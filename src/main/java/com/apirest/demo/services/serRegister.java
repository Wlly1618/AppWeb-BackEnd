package com.apirest.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.demo.models.forUsers.Register;
import com.apirest.demo.repositories.repRegister;

@Service
public class serRegister {
    
    @Autowired
    private repRegister rep;

    public Register saveRegister(Register register) {
        return rep.save(register);
    }

    public List<Register> listRegister() {
        return (List<Register>) rep.findAll();
    }

    public Optional<Register> getRegister(Integer id) {
        return rep.findById(id);
    }
}
