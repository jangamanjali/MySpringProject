package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.FoodItems;
import com.example.demo.service.FoodItemsService;

@RestController
@RequestMapping("/food")
public class FoodItemsController {
	
	@Autowired
	FoodItemsService fooditemsService;
	
	@GetMapping("/show")
	public  List<FoodItems>findAll()
	{
		return fooditemsService.findAll();
	}
	
	@GetMapping("findbyid/{id}")
	public FoodItems findById(@PathVariable int id)
	{
	return fooditemsService.findById(id);
	
	}
	
	@PostMapping("/save")
    public FoodItems save(@RequestBody FoodItems f)
    {
    	f.setId(0);
    	fooditemsService.saveorUpdate(f);
    	return f;
    }
	
	@PutMapping("/update")
	public FoodItems update (@RequestBody FoodItems f)
	{
		fooditemsService.saveorUpdate(f);
		return f;
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		FoodItems f = findById(id);
		if(f==null)
		{
			throw new RuntimeException("delete id not found");
		}
		else
		{
			fooditemsService.deleteById(id);
		}
		return "id"+id;
	}

}
