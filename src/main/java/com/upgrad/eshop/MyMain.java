package com.upgrad.eshop;
import com.upgrad.eshop.dao.*;
import com.upgrad.eshop.entities.*;
import com.upgrad.eshop.services.InitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MyMain implements CommandLineRunner{

    @Autowired
    InitService initService;

    public static void main(String[] args) {
        SpringApplication.run(MyMain.class, args);
    }

    @Override
    public void run(String... arg0){
        initService.start();
    }
}
