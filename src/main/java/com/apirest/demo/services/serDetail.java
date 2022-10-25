package com.apirest.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.demo.models.forTasks.Detail;
import com.apirest.demo.models.forTasks.Invoice;
import com.apirest.demo.models.forTasks.Product;
import com.apirest.demo.repositories.repDetail;

@Service
public class serDetail {
    
    @Autowired private repDetail rep;

    public Detail getDetail(Detail detail) {
        return rep.save(detail);
    }

    public List<Detail> getListDetails() {
        return (List<Detail>) rep.findAll();
    }

    public Optional<Detail> getDetail(int id) {
        return rep.findById(id);
    }

    public boolean deleteDetail(int id) {
        try {
            rep.deleteById(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public List<Detail> getForInvoice(Invoice invoice) {
        return rep.findByInvoice(invoice);
    }

    public List<Detail> getForProduct(Product product) {
        return rep.findByProduct(product);
    }
}
