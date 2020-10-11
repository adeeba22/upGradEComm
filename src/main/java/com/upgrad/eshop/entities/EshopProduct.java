package com.upgrad.eshop.entities;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "eshop_product")
public class EshopProduct {

    @GeneratedValue
    @Id
    int productId;
    @Column( nullable = false)
    String name;
    String category;
    @Column( nullable = false)
    double price;
    String description;
    String manufacturer;
    @Column( nullable = false)
    int available_items;
    String image_url;
    Date created;
    Date updated;

    @OneToMany
    @JsonManagedReference
    List<EshopOrder> eshopOrderList;
}
