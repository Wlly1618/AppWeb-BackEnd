package com.apirest.demo.models.forUsers;

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
public class TypeUser {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTyUs;

    @Column(length = 30, nullable = false)
    private String type;

    @Column(length = 3, nullable = false)
    private String cod;

}
