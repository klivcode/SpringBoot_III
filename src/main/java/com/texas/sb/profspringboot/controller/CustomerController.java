package com.texas.sb.profspringboot.controller;


import com.texas.sb.profspringboot.dto.ApiResponse;
import com.texas.sb.profspringboot.dto.CustomerDto;
import com.texas.sb.profspringboot.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController extends BaseController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/save")
    public ResponseEntity<ApiResponse> saveCustomer(@RequestBody CustomerDto customerDto) {
        customerDto = customerService.save(customerDto);
        if (customerDto.getId() != null) {
            return ResponseEntity.ok(createResponse("Customer created successfully", Boolean.TRUE, customerDto));
        } else {
            return ResponseEntity.ok(createResponse("Customer creation failed", Boolean.FALSE, customerDto));
        }
    }

    @GetMapping()
    public ResponseEntity<ApiResponse> findAllCustomer() {
        List<CustomerDto> customerDtoList = customerService.findAll();
        if (!customerDtoList.isEmpty()) {
            return ResponseEntity.ok(createResponse("customer list fetched successfully", Boolean.TRUE, customerDtoList));
        } else {
            return ResponseEntity.ok(createResponse("Customer fetch failed", Boolean.FALSE, customerDtoList));
        }
    }

    @GetMapping("/find-by-mobile-number")
    public ResponseEntity<ApiResponse> findCustomerById(@RequestParam("mobileNumber") String mobileNumber) {
        CustomerDto customerDto = customerService.findByMobileNumber(mobileNumber);
        if (customerDto != null) {
            return ResponseEntity.ok(createResponse("customer list fetched successfully", Boolean.TRUE, customerDto));
        } else {
            return ResponseEntity.ok(createResponse("Customer fetch failed", Boolean.FALSE, customerDto));
        }
    }
}
