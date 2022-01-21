package com.sunglowsys.repository;


import com.sunglowsys.domain.Orders;

import java.util.List;

public interface OrdersRepository {
    Orders saveOrders(Orders orders);

    Orders UpdateOrders(Orders orders,Long id);

    Orders findById(Long id);

    List<Orders> findAll();

    void deleteOrders(Long id);
}
