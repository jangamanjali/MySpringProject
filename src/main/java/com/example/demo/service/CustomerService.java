package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;



public interface CustomerService {
	
	public List<Customer> findAll();
	public Customer findById(int id);
	public void saveorUpdate(Customer c);
	public void deleteById(int id);


}
