package com.egen.ecom.orderprocessing.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.egen.ecom.shopping.cart.domain.Address;
@Entity
public class Customer {
	
	
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	private int orderCustomerId; 
	private String orderFirstName;
	private String orderLastName;
	private List<Address> address;
	

	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public int getOrderCustomerId() {
		return orderCustomerId;
	}
	public void setOrderCustomerId(int orderCustomerId) {
		this.orderCustomerId = orderCustomerId;
	}
	public String getOrderFirstName() {
		return orderFirstName;
	}
	public void setOrderFirstName(String orderFirstName) {
		this.orderFirstName = orderFirstName;
	}
	public String getOrderLastName() {
		return orderLastName;
	}
	public void setOrderLastName(String orderLastName) {
		this.orderLastName = orderLastName;
	}
	@Override
	public String toString() {
		return "Customer [orderCustomerId=" + orderCustomerId + ", orderFirstName=" + orderFirstName
				+ ", orderLastName=" + orderLastName + ", address=" + address + "]";
	}
	public Customer(int orderCustomerId, String orderFirstName, String orderLastName, List<Address> address) {
		super();
		this.orderCustomerId = orderCustomerId;
		this.orderFirstName = orderFirstName;
		this.orderLastName = orderLastName;
		this.address = address;
	}
	
	

}
