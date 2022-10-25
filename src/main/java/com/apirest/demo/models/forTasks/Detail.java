package com.apirest.demo.models.forTasks;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Detail {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetail;

    @Column(length = 5, nullable = false)
    private int amount;

    @ManyToOne(cascade = CascadeType.PERSIST, optional = false) @JoinColumn(nullable = false)
    private Product product;

    @ManyToOne(cascade = CascadeType.PERSIST, optional = false) @JoinColumn(nullable = false)
    private Invoice invoice;
}
