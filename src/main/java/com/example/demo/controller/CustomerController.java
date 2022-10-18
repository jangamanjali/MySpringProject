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

import com.example.demo.entity.Customer;

import com.example.demo.service.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	
	@Autowired
	CustomerService customerservice;
	
	@GetMapping("/show")
	public  List<Customer>findAll()
	{
		return customerservice.findAll();
	}
	
	/*@RequestMapping("/fooditems/{foodId}/orders")
	public List<Orders> getOrdersByFoodItems(@PathVariable int id){
		return orderservice.findAll();
	}*/
	@GetMapping("findbyid/{id}")
	public Customer findById(@PathVariable int id)
	{
	return customerservice.findById(id);
	
	}
	
	@PostMapping("/save")
    public Customer save(@RequestBody Customer c)
    {
    	c.setId(0);
		customerservice.saveorUpdate(c);
    	return c;
    }
	
	@PutMapping("/update")
	public Customer update (@RequestBody Customer c)
	{
		customerservice.saveorUpdate(c);
		return c;
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		Customer c = findById(id);
		if(c==null)
		{
			throw new RuntimeException("delete id not found");
		}
		else
		{
			customerservice.deleteById(id);
		}
		return "customer id" +id;
	}


}
