package com.sunglowsys.service;

import com.sunglowsys.domain.Orders;
import com.sunglowsys.repository.OrdersRepository;
import com.sunglowsys.repository.OrdersRepositoryImpl;

import java.util.List;

public class OrdersServiceImpl implements OrdersService{

    private OrdersRepository ordersRepository = new OrdersRepositoryImpl();

    @Override
    public Orders saveOrders(Orders orders) {
        return ordersRepository.saveOrders(orders);
    }

    @Override
    public Orders UpdateOrders(Orders orders, Long id) {
        return ordersRepository.UpdateOrders(orders,id);
    }

    @Override
    public Orders findById(Long id) {
        return ordersRepository.findById(id);
    }

    @Override
    public List<Orders> findAll() {
        List<Orders> ordersList = ordersRepository.findAll();
        return ordersList;
    }

    @Override
    public void deleteOrders(Long id) {
        ordersRepository.deleteOrders(id);

    }
}
