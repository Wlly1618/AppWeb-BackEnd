package com.apirest.demo.models.forUsers;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @EqualsAndHashCode
public class PersonalDetails {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPerDet;

    @Column(nullable = false, length = 45, updatable = false)
    private String name;

    @Column(nullable = false, length = 45, updatable = false)
    private String surname;

    @Column(nullable = false, length = 10, updatable = false)
    private String dni;

    @Column(nullable = false, length = 12)
    private String phone;

    @Column(nullable = false, length = 55)
    private String residence;

    @Column(nullable = false, updatable = false)
    private Date born;
}
