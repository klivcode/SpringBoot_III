package com.kliv.spring.sprinffrof_iii.repository;

import com.kliv.spring.sprinffrof_iii.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepo extends JpaRepository<Employees,Integer> {
}
