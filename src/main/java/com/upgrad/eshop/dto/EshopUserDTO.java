package com.upgrad.eshop.dto;

import lombok.Data;
import java.util.Date;

@Data
public class EshopUserDTO {

    int  id;
    String userName;
    String firstName;
    String lastName;
    String password;
    String email;
    String phone_number;
    String role;
    Date created;
    Date updated;
}
