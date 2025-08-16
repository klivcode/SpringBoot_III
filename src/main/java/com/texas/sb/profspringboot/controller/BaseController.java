package com.texas.sb.profspringboot.controller;

import com.texas.sb.profspringboot.dto.ApiResponse;

public class BaseController {

    public ApiResponse createResponse(String message, Boolean status, Object data) {
        return new ApiResponse(message, status, data);
    }

}
