package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Orders;
import com.sunglowsys.service.CustomerServiceImpl;
import com.sunglowsys.service.OrdersServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class SaveCustomer {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer("Surendra","Singh","ss@gmail.com","7846536578","male");
        Customer result = new CustomerServiceImpl().saveCustomer(customer);
        System.out.println("saved"+result);


        Orders orders = new Orders();
        Orders orders1 = new Orders();
        Orders orders2 = new Orders();
        orders.setCustomer(result);
        orders1.setCustomer(result);
        orders2.setCustomer(result);



        Orders result1 = new OrdersServiceImpl().saveOrders(orders);
        System.out.println(result1);

        Orders result2 = new OrdersServiceImpl().saveOrders(orders1);
        System.out.println(result2);

        Orders result3 = new OrdersServiceImpl().saveOrders(orders2);
        System.out.println(result3);


    }
}
