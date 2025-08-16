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
@Table(name = "customer", uniqueConstraints = {
        @UniqueConstraint(columnNames = "mobile_number", name = "uk_cust_mobilenum")
})
public class Customer extends AuditAbstract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "full_name", length = 100, nullable = false)
    private String fullName;

    @Column(name = "mobile_number", length = 10, nullable = false)
    private String mobileNumber;

    @Column(name = "alternate_mobile_number", length = 10, nullable = false)
    private String alternateMobileNumber;

    @Column(name = "deliver_address", length = 200, nullable = false)
    private String deliveryAddress;
}
