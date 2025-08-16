package com.texas.sb.profspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private Integer id;

    private String fullName;

    private String mobileNumber;

    private String alternateMobileNumber;

    private String deliveryAddress;
}
