package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;



@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	EntityManager entitymanager;

	@Override
	public List<Customer> findAll() {
		Session currentSession=entitymanager.unwrap(Session.class);
		Query<Customer>query=currentSession.createQuery("select o from Customer o",Customer.class);
		List<Customer> customerlist=query.getResultList();
		return customerlist;
	}

	@Override
	public Customer findById(int id) {
		Session currentSession=entitymanager.unwrap(Session.class);
		return currentSession.get(Customer.class,id);
	}

	@Override
	@Transactional
	public void saveorUpdate(Customer c) {
		Session currentSession=entitymanager.unwrap(Session.class);
		currentSession.saveOrUpdate(c);
	}

	//@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public void deleteById(int id) {
		Session currentSession=entitymanager.unwrap(Session.class);
		Query<Customer>query=currentSession.createQuery("delete from Customer where id =: id");
		query.setParameter("id", id);
		query.executeUpdate();
	}
	
	

}
