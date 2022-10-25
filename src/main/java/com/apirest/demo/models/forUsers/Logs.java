package com.apirest.demo.models.forUsers;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Logs {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLog;

    @Column(length = 5, nullable = false, updatable = false)
    private String aka;

    @Column(length = 50, nullable = false, updatable = false)
    private String action;

    @Column(nullable = false, updatable = false)
    private Date dateLog;

    @ManyToOne(cascade = CascadeType.PERSIST, optional = false)
    private User user;
}
