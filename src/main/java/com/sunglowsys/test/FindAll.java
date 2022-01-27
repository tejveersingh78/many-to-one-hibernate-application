package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Orders;
import com.sunglowsys.repository.CustomerRepositoryImpl;
import com.sunglowsys.repository.OrdersRepositoryImpl;

import java.util.List;

public class FindAll {
    public static void main(String[] args) {
        List<Orders> ordersList = new OrdersRepositoryImpl().findAll();
             for (Orders orders : ordersList){
            System.out.println(orders);
        }
    }
}
