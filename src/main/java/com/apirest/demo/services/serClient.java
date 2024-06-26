package com.apirest.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.demo.models.others.Client;
import com.apirest.demo.repositories.repClient;

@Service
public class serClient {
    
    @Autowired private repClient rep;

    public Client saveClient(Client client) {
        return rep.save(client);
    }

    public List<Client> getListClients() {
        return (List<Client>) rep.findAll();
    }

    public Optional<Client> getClient(int id) {
        return rep.findById(id);
    }

    public boolean deleteClient(int id) {
        try {
            rep.deleteById(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
