package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Orders;

@Repository
public class OrderDaoImpl implements OrderDao {

	@Autowired
	EntityManager entitymanager;
	
	@Override
	public List<Orders> findAll() {
		Session currentSession=entitymanager.unwrap(Session.class);
		Query<Orders>query=currentSession.createQuery("select o from Orders o",Orders.class);
		List<Orders> orderlist=query.getResultList();
		return orderlist;
	}

	@Override
	public Orders findById(int orderid) {
		Session currentSession=entitymanager.unwrap(Session.class);
		return currentSession.get(Orders.class,orderid);

	}

	@Override
	@Transactional
	public void saveorUpdate(Orders o) {
		Session currentSession=entitymanager.unwrap(Session.class);
		currentSession.saveOrUpdate(o);
		
	}

	@Override
	@Transactional
	public void deleteById(int orderid) {
		
	}

	/*@Override
	public List<Orders> getOrdersByFoodItems(int foodId) {
		Session currentSession=entitymanager.unwrap(Session.class);
		Query<Orders>query=currentSession.createQuery("select o from Orders o",Orders.class);
		List<Orders> orderlist=query.getResultList();
		return orderlist;
	}*/

}
