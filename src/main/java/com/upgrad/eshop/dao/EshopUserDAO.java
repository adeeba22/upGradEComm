package com.upgrad.eshop.dao;
import com.upgrad.eshop.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EshopUserDAO extends JpaRepository<EshopUser, Integer> {
}
