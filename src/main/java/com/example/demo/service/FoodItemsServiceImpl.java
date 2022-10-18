package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FoodItemsDao;
import com.example.demo.entity.FoodItems;

@Service
public class FoodItemsServiceImpl implements FoodItemsService {
	@Autowired	
	FoodItemsDao fooditemdao;
	@Override
	public List<FoodItems> findAll() {
		return fooditemdao.findAll();
	}

	@Override
	public FoodItems findById(int id) {
		return fooditemdao.findById(id);
	}

	@Override
	public void saveorUpdate(FoodItems f) {
		fooditemdao.saveorUpdate(f);
		
	}

	@Override
	public void deleteById(int id) {
		fooditemdao.deleteById(id);
		
	}


}
