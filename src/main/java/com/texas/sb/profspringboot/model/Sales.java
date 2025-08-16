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
@Table(name = "sales", uniqueConstraints = {
})
public class Sales extends AuditAbstract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Customer.class)
    @JoinColumn(name = "customer_id", nullable = false, foreignKey = @ForeignKey(name = "fk_sales_customerid"))
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Product.class)
    @JoinColumn(name = "product_id", nullable = false, foreignKey = @ForeignKey(name = "fk_sales_productid"))
    private Product product;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "discount", nullable = false)
    private Float discount = 0.0f;

    @Column(name = "total_selling_price", nullable = false)
    private Float totalSellingPrice = 0.0f;

    @Column(name = "total_price", nullable = false)
    private Float totalPrice = 0.0f;
}
