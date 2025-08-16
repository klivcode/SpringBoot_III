package com.texas.sb.profspringboot.converter;

import com.texas.sb.profspringboot.dto.CustomerDto;
import com.texas.sb.profspringboot.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerConverter extends AbstractConverter<CustomerDto, Customer> {


    @Override
    public CustomerDto toDto(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setFullName(customer.getFullName());
        customerDto.setDeliveryAddress(customer.getDeliveryAddress());
        customerDto.setMobileNumber(customer.getMobileNumber());
        customerDto.setAlternateMobileNumber(customer.getAlternateMobileNumber());
        return customerDto;
    }

    @Override
    public List<CustomerDto> toDtoList(List<Customer> entity) {
        List<CustomerDto> customerDtoList = new ArrayList<>();
        for (Customer customer : entity) {
            customerDtoList.add(toDto(customer));
        }
        return customerDtoList;
    }

    @Override
    public Customer toEntity(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setId(customerDto.getId());
        customer.setFullName(customerDto.getFullName());
        customer.setDeliveryAddress(customerDto.getDeliveryAddress());
        customer.setMobileNumber(customerDto.getMobileNumber());
        customer.setAlternateMobileNumber(customerDto.getAlternateMobileNumber());
        return customer;
    }
}
