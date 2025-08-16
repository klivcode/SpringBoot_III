package com.texas.sb.profspringboot.service.impl;

import com.texas.sb.profspringboot.converter.CustomerConverter;
import com.texas.sb.profspringboot.dto.CustomerDto;
import com.texas.sb.profspringboot.model.Customer;
import com.texas.sb.profspringboot.repo.CustomerRepo;
import com.texas.sb.profspringboot.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;
    private final CustomerConverter customerConverter;

    public CustomerServiceImpl(CustomerRepo customerRepo,
                               CustomerConverter customerConverter) {
        this.customerRepo = customerRepo;
        this.customerConverter = customerConverter;
    }

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        Customer customer = customerConverter.toEntity(customerDto);
        customer = customerRepo.save(customer);
        customerDto = customerConverter.toDto(customer);
        return customerDto;
    }

    @Override
    public CustomerDto update(CustomerDto customerDto) {
        return null;
    }

    @Override
    public List<CustomerDto> findAll() {
        List<Customer> customers = customerRepo.findAll();
        return customerConverter.toDtoList(customers);
    }

    @Override
    public CustomerDto findById(Integer integer) {
        return null;
    }

    @Override
    public CustomerDto findByMobileNumber(String mobileNumber) {
        Optional<Customer> optionalCustomer = customerRepo.findByMobileNumber(mobileNumber);
        if (optionalCustomer.isPresent()) {
            return customerConverter.toDto(optionalCustomer.get());
        }
        return null;
    }
}
