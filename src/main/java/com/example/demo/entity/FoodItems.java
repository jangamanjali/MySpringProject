package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="fooditems")
public class FoodItems {
	
	@Id
	@Column(name="food_id")
	private int food_id;
	@Column(name="food_name")
	private String food_name;
	@Column(name="price")
	private double price;
	
	
	public FoodItems()
	{
		
	}

	public FoodItems(int food_id, String food_name, double price) {
		super();
		this.food_id = food_id;
		this.food_name = food_name;
		this.price = price;
		
	}

	public int getId() {
		return food_id;
	}

	public void setId(int foodId) {
		this.food_id = foodId;
	}

	public String getFoodName() {
		return food_name;
	}

	public void setFoodName(String food_name) {
		this.food_name = food_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodItems [foodId=" + food_id + ", foodName=" + food_name + ", price=" + price + "]";
	}

	
}
