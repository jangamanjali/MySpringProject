package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Orders;


public interface OrderDao {
    //public List<Orders> getOrdersByFoodItems(int foodId);
	public List<Orders>findAll();
	public Orders findById(int orderid);
	public void saveorUpdate(Orders o);
	public void deleteById(int orderid);
}
