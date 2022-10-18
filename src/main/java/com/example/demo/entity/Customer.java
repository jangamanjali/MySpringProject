package com.example.demo.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer")
public class Customer {

		@Id
		//@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="id")
		private int id;
		@Column(name="cust_name")
		private String cust_name;
		@Column(name="email")
		private String email;
		//@Column(name="contactNo")
		//private int contactNo;
		@Column(name="address")
		private String address;

		 
		public Customer()
		{
			
		}

		
		public Customer(int id, String cust_name, String email,String address) {
			super();
			this.id = id;
			this.cust_name = cust_name;
			this.email = email;
			//this.contactNo = contactNo;
			this.address = address;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getCustName() {
			return cust_name;
		}


		public void setCustName(String custName) {
			this.cust_name = custName;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		/*public int getContactNo() {
			return contactNo;
		}


		public void setContactNo(int contactNo) {
			this.contactNo = contactNo;
		}*/


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		@Override
		public String toString() {
			return "Customer [id=" + id + ", cust_name=" + cust_name + ", email=" + email + ", address=" + address + "]";
		}

		



}
