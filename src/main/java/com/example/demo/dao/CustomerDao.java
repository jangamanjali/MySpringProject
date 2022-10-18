package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Customer;



public interface CustomerDao {
	
	public List<Customer>findAll();
	public Customer findById(int id);
	public void saveorUpdate(Customer c);
	public void deleteById(int id);

}
