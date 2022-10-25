package com.apirest.demo.models.forUsers;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @EqualsAndHashCode
public class User {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @OneToOne(optional = false, cascade = CascadeType.PERSIST) @JoinColumn(nullable = false, updatable = false)
    private PersonalDetails personalDetails;

    @OneToOne(optional = false, cascade = CascadeType.PERSIST) @JoinColumn(nullable = false)
    private TypeUser typeUser;
}
