package com.kliv.spring.sprinffrof_iii.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.logging.log4j.util.Lazy;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employees", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"phone_number"},name = "uk_phoneNum"),
        @UniqueConstraint(columnNames = {"email"},name = "uk_email")
})
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer employeeId;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name",nullable = false)
    private String lastName;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    @Column(name = "hire_date", nullable = false)
    private String hireDate;

    @Column(nullable = false)
    private Double salary;

    // Many employees belong to one department
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    private Departments department;

    // One employee has one address
    @OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address address;
}
