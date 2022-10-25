package com.apirest.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.demo.models.forTasks.Invoice;
import com.apirest.demo.repositories.repInvoice;

@Service
public class serInvoice {
    @Autowired
    private repInvoice rep;

    public Invoice saveInvoice(Invoice invoice) {
        return rep.save(invoice);
    }

    public List<Invoice> getListInvoices() {
        return (List<Invoice>) rep.findAll();
    }

    public Optional<Invoice> getInvoice(int id) {
        return rep.findById(id);
    }

    public boolean deleteInvoice(int id) {
        try {
            rep.deleteById(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
