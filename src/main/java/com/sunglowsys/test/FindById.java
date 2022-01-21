package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Orders;
import com.sunglowsys.repository.CustomerRepositoryImpl;
import com.sunglowsys.repository.OrdersRepositoryImpl;
import com.sunglowsys.service.CustomerServiceImpl;

public class FindById {
    public static void main(String[] args) {
        Customer customer = new CustomerRepositoryImpl().findById(2L);
        System.out.println(customer);
    }
}
