package com.apirest.demo.models.forTasks;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Product {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProd;

    @Column(length = 15, nullable = false, updatable = false)
    private String nameProd;

    @Column(length = 50)
    private String description;

    @Column(nullable = false)
    private String price;
}
