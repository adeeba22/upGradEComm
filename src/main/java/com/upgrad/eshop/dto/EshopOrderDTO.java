package com.upgrad.eshop.dto;

import lombok.Data;

import java.util.Date;

@Data
public class EshopOrderDTO {

    int id;
    int userId;
    int productProductId;
    int shippingAddressId;
    double amount;
    Date order_date;
}
