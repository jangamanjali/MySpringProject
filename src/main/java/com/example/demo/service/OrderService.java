package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Orders;

public interface OrderService {
	
	public List<Orders> findAll();
	public Orders findById(int id);
	public void saveorUpdate(Orders o);
	public void deleteById(int orderid);

}
