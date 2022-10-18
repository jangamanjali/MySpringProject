package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="location")
	private String location;
	
	/*@Column(name="user_id")
	private int user_id;
	
	@ManyToOne(targetEntity=User.class, fetch=FetchType.EAGER)
	@JoinColumn(name ="user_id",insertable = false, updatable = false)
	private User user;
	
	public User getUser() {
		return user;
	}
	
	public void setUser (User user)
	{
		this.user= user;
	}*/
	
	 
	public Orders()
	{
		
	}

	public Orders(int id, String location) {
		super();
		this.id = id;
		this.location = location;
		//this.user_id = user_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", location=" + location + "]";
	}

	/*public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}*/

	


	
	
}
