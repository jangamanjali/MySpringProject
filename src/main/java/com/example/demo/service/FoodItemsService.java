package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.FoodItems;



public interface FoodItemsService {
	public List<FoodItems> findAll();
	public FoodItems findById(int id);
	public void saveorUpdate(FoodItems f);
	public void deleteById(int id);

}
