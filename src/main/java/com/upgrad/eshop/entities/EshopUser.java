package com.upgrad.eshop.entities;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "eshop_user")
public class EshopUser {

    @GeneratedValue
    @Id
    int  id;
    @Column( nullable = false, unique = true)
    String userName;
    @Column( nullable = false)
    String firstName;
    @Column( nullable = false)
    String lastName;
    @Column( nullable = false, unique = true)
    String password;
    @Column( nullable = false, unique = true)
    String email;
    @Column( nullable = false)
    String phone_number;
    @Column( nullable = false)
    String role;
    Date created;
    Date updated;

    @OneToMany
    @JsonManagedReference
    List<EshopOrder> eshopOrderList;

    @OneToMany
    @JsonManagedReference
    List<EshopShippingAddress> eshopShippingAddressList;
}
