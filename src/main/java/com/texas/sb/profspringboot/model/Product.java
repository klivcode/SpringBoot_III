package com.texas.sb.profspringboot.model;

import com.texas.sb.profspringboot.model.abstracts.AuditAbstract;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product", uniqueConstraints = {
        @UniqueConstraint(columnNames = "name", name = "uk_product_name")
})
public class Product extends AuditAbstract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "brand", length = 100, nullable = false)
    private String brand;

    @Column(name = "stock_count", nullable = false)
    private Integer stockCount;

    @Column(name = "cost_price", nullable = false)
    private Float costPrice;

    @Column(name = "selling_price", nullable = false)
    private Float sellingPrice;

    @Column(name = "discount_applicable", nullable = false)
    private Boolean discountApplicable = Boolean.FALSE;
}
