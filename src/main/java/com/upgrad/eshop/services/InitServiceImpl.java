package com.upgrad.eshop.services;
import com.upgrad.eshop.dao.*;
import com.upgrad.eshop.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InitServiceImpl implements InitService{

    @Autowired
    EshopOrderDAO eshopOrderDAO;
    @Autowired
    EshopProductDAO eshopProductDAO;
    @Autowired
    EshopShippingAddressDAO eshopShippingAddressDAO;
    @Autowired
    EshopUserDAO eshopUserDAO;

    @Override
    public void start()
    {
        EshopOrder eshopOrder= new EshopOrder();
        eshopOrder.getId();
        eshopOrderDAO.findById(3);

//        System.out.println("connection successful");
    }
}
