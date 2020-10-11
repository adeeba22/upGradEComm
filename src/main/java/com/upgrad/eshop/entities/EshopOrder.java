package com.upgrad.eshop.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "eshop_order")
public class EshopOrder {

    @GeneratedValue
    @Id
    int id;
    @Column( nullable = false)
    int userId;
    @Column( nullable = false)
    int productProductId;
    @Column( nullable = false)
    int shippingAddressId;
    double amount;
    Date order_date;

    @ManyToOne
    @JsonBackReference
    private EshopProduct eshopProduct;

    @ManyToOne
    @JsonBackReference
    private EshopUser eshopUser;

    @ManyToOne
    @JsonBackReference
    private EshopShippingAddress eshopShippingAddress;
}
