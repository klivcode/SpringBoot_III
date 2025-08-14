package com.kliv.spring.sprinffrof_iii.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeesDTO {

    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String hireDate;
    private Double salary;

    // Department info
    private Integer departmentId;
    private String departmentName;
    private String location;

    // Address info
    private Integer addressId;
    private String street;
    private String city;
    private String state;
    private String postalCode;
}

