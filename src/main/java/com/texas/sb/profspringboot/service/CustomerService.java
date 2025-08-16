package com.texas.sb.profspringboot.service;

import com.texas.sb.profspringboot.dto.CustomerDto;

public interface CustomerService extends CRUDService<CustomerDto, Integer> {

    CustomerDto findByMobileNumber(String mobileNumber);

}
