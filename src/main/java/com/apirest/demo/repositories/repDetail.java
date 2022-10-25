package com.apirest.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.apirest.demo.models.forTasks.Detail;
import com.apirest.demo.models.forTasks.Invoice;
import com.apirest.demo.models.forTasks.Product;

@RepositoryRestResource
public interface repDetail extends JpaRepository<Detail, Integer> {
    public ArrayList<Detail> findByInvoice(Invoice invoice);
    public ArrayList<Detail> findByProduct(Product product);
}
