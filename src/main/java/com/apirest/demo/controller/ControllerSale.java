package com.apirest.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.demo.models.forTasks.Detail;
import com.apirest.demo.models.forTasks.Invoice;
import com.apirest.demo.services.serDetail;

@RestController @CrossOrigin("localhost:/3400") @RequestMapping("/sale")
public class ControllerSale {

    @Autowired
    private serDetail serdetail;

    @GetMapping("/hola")
    public String hello() {
        return "hola";
    }

    @GetMapping("/detail/query")
    public List<Detail> getListDetail(@RequestParam("invoice") Invoice invoice) {
        return serdetail.getForInvoice(invoice);
    }
}
