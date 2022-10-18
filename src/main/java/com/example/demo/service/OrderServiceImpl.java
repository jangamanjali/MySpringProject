package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrderDao;
import com.example.demo.entity.Orders;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired	
	OrderDao orderdao;
	@Override
	public List<Orders> findAll() {
		return orderdao.findAll();
	}

	@Override
	public Orders findById(int orderid) {
		return orderdao.findById(orderid);
	}

	@Override
	public void saveorUpdate(Orders o) {
		orderdao.saveorUpdate(o);
		
	}

	@Override
	public void deleteById(int orderid) {
		 orderdao.deleteById(orderid);
		
	}

}
