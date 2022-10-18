package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.FoodItems;


public interface FoodItemsDao {
	
	
	public List<FoodItems> findAll();
	public FoodItems findById(int id);
	public void saveorUpdate(FoodItems f);
	public void deleteById(int id);

}
