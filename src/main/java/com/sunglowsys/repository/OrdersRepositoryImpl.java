package com.sunglowsys.repository;

import com.sunglowsys.domain.Orders;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class OrdersRepositoryImpl implements OrdersRepository{

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Orders saveOrders(Orders orders) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(orders);
        session.getTransaction().commit();
        session.close();
        return orders;
    }

    @Override
    public Orders UpdateOrders(Orders orders, Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Orders result = session.get(Orders.class,id);
        result.setOrderName(orders.getOrderName());
        session.update(result);
        session.getTransaction().commit();
        session.close();
        System.out.println("updated--");
        return null;
    }

    @Override
    public Orders findById(Long id) {
        Session session= sessionFactory.openSession();
        Orders orders = session.get(Orders.class,id);
        return orders;
    }

    @Override
    public List<Orders> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Orders");
        List<Orders> ordersList = query.list();
        return ordersList;

    }

    @Override
    public void deleteOrders(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Orders orders = session.get(Orders.class,id);
        session.delete(orders);
        session.getTransaction().commit();
        session.close();
        System.out.println("deleted--");
    }
}
