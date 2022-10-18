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

import com.example.demo.entity.Orders;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

		@Autowired
		OrderService orderservice;
		
		@GetMapping("/show")
		public  List<Orders>findAll()
		{
			return orderservice.findAll();
		}
		
		/*@RequestMapping("/fooditems/{foodId}/orders")
		public List<Orders> getOrdersByFoodItems(@PathVariable int id){
			return orderservice.findAll();
		}*/
		@GetMapping("findbyid/{id}")
		public Orders findById(@PathVariable int id)
		{
		return orderservice.findById(id);
		
		}
		
		@PostMapping("/save")
	    public Orders save(@RequestBody Orders o)
	    {
	    	o.setId(0);
			orderservice.saveorUpdate(o);
	    	return o;
	    }
		
		@PutMapping("/update")
		public Orders update (@RequestBody Orders o)
		{
			orderservice.saveorUpdate(o);
			return o;
		}
		
		@DeleteMapping("/delete/id")
		public String delete(@PathVariable int id)
		{
			Orders o = findById(id);
			if(o ==null)
			{
				throw new RuntimeException("delete id not found");
			}
			else
			{
				orderservice.deleteById(id);
			}
			return "orderid"+id;
		}
	


}
