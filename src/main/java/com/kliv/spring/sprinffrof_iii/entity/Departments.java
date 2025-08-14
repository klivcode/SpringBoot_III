package com.kliv.spring.sprinffrof_iii.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Departments", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"department_name"},name = "uk_departmentId")
})
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id",nullable = false)
    private Integer departmentId;
    @Column(name = "department_name",nullable = false)
    private String departmentName;
    @Column(name = "location",nullable = false)
    private String location;

    // One Department has many Employees
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Employees> employees;
}
