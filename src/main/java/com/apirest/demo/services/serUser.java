package com.apirest.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.demo.models.forUsers.User;
import com.apirest.demo.repositories.repUser;

@Service
public class serUser {
    
    @Autowired private repUser rep;

    public User saveUser(User user) {
        return rep.save(user);
    }

    public List<User> getListUser() {
        return (List<User>) rep.findAll();
    }

    public Optional<User> getUserForId(Integer id) {
        return rep.findById(id);
    }

    public boolean deleteUser(Integer id) {
        try {
            rep.deleteById(id);
            return true;
        } catch (ExceptionInInitializerError e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
