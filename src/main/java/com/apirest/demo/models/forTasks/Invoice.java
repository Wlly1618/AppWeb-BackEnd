package com.apirest.demo.models.forTasks;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.apirest.demo.models.forUsers.User;
import com.apirest.demo.models.others.Client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Invoice {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInvoice;

    @Column(length = 12, nullable = false)
    private String paymentStatus;

    @Column(length = 12, nullable = false)
    private String deliveryStatus;

    @Column(nullable = false) @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date date;

    @ManyToOne(cascade = CascadeType.PERSIST, optional = false) @JoinColumn(nullable = false)
    private Client client;

    @ManyToOne(cascade = CascadeType.PERSIST, optional = false) @JoinColumn(nullable = false)
    private User user;
}
