package com.texas.sb.profspringboot.converter;

import java.util.List;

public abstract class AbstractConverter<DTO, ENTITY> {
    public abstract DTO toDto(ENTITY entity);

    public abstract List<DTO> toDtoList(List<ENTITY> entity);

    public abstract ENTITY toEntity(DTO dto);
}
