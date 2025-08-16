package com.texas.sb.profspringboot.service;

import java.util.List;

public interface CRUDService<DTO, ID> {

    DTO save(DTO dto);

    DTO update(DTO dto);

    List<DTO> findAll();

    DTO findById(ID id);
}
