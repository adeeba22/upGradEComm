package com.upgrad.eshop.dto;

import lombok.Data;

import java.util.Date;

@Data
public class EshopProductDTO {

    int productId;
    String name;
    String category;
    double price;
    String description;
    String manufacturer;
    int available_items;
    String image_url;
    Date created;
    Date updated;
}
