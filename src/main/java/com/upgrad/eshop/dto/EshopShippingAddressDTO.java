package com.upgrad.eshop.dto;

import lombok.Data;

@Data
public class EshopShippingAddressDTO {

    int id;
    String name;
    String phone;
    String street;
    String landmark;
    String city;
    String state;
    String zipcode;
    int userId;
}
