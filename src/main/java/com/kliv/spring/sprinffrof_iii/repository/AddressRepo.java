package com.kliv.spring.sprinffrof_iii.repository;

import com.kliv.spring.sprinffrof_iii.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Integer> {
}
