package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Orders;
import com.sunglowsys.repository.OrdersRepositoryImpl;
import com.sunglowsys.service.CustomerServiceImpl;
import com.sunglowsys.service.OrdersServiceImpl;

public class UpdateCustomer {
    public static void main(String[] args) {
        Orders orders = new Orders();
        orders.setOrderName("Charger");
        new OrdersRepositoryImpl().UpdateOrders(orders,1L);
    }
}
