package com.upgrad.eshop.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "eshop_shipping_address")
public class EshopShippingAddress {

    @GeneratedValue
    @Id
    int id;
    @Column( nullable = false)
    String name;
    @Column( nullable = false)
    String phone;
    @Column( nullable = false)
    String street;
    String landmark;
    @Column( nullable = false)
    String city;
    @Column( nullable = false)
    String state;
    @Column( nullable = false)
    String zipcode;
    @Column( nullable = false)
    int userId;

    @OneToMany
    @JsonManagedReference
    List<EshopOrder> eshopOrderList;

    @ManyToOne
    @JsonBackReference
    private EshopUser eshopUser;
}
