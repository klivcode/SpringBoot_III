package com.texas.sb.profspringboot.model.abstracts;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class AuditAbstract {
    @Column(updatable = false, name = "created_at")
    private LocalDateTime createdAt;

    @Column(updatable = false, name = "modified_at")
    private LocalDateTime modifiedAt;

    @Column(updatable = false, name = "created_by")
    private Integer createdBy;

    @Column(updatable = false, name = "modified_by")
    private Integer modifiedBy;
}
