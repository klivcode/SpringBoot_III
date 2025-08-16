package com.texas.sb.profspringboot.repo;

import com.texas.sb.profspringboot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    @Query(value = "select * from customer where mobile_number=?1", nativeQuery = true)
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
