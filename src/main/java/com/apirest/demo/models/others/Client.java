package com.apirest.demo.models.others;

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
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;

    @Column(length = 30, nullable = false, updatable = false)
    private String nameClient;

    @Column(length = 10, nullable = false, updatable = false)
    private String dniClient;
}
