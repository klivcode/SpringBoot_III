package com.texas.sb.profspringboot.repo;

import com.texas.sb.profspringboot.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepo extends JpaRepository<Sales, Integer> {
}
