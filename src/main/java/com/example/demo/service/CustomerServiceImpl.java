package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.dao.OrderDao;
import com.example.demo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired	
	CustomerDao customerdao;
	@Override
	public List<Customer> findAll() {
		return customerdao.findAll();
	}

	@Override
	public Customer findById(int id) {
		return customerdao.findById(id);
	}

	@Override
	public void saveorUpdate(Customer c) {
		customerdao.saveorUpdate(c);
		
	}

	@Override
	public void deleteById(int id) {
		customerdao.deleteById(id);
			
	}

}
