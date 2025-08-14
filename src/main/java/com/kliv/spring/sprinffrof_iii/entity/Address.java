package com.kliv.spring.sprinffrof_iii.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id",nullable = false)
    private Integer addressId;
    @Column(nullable = false)
    private String City;
    @Column(nullable = false)
    private String State;
    @Column(nullable = false)
    private String PostalCode;
    @Column(nullable = false)
    private String Street;

    // One-to-One with Employee
    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Employees employee;
}
