package com.sunglowsys.service;

import com.sunglowsys.domain.Orders;

import java.util.List;

public interface OrdersService {
    Orders saveOrders(Orders orders);

    Orders UpdateOrders(Orders orders,Long id);

    Orders findById(Long id);

    List<Orders> findAll();

    void deleteOrders(Long id);
}
