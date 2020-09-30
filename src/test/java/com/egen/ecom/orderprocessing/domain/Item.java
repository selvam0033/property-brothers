package com.egen.ecom.orderprocessing.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	private int orderItemId;
	private String orderItemName;
	private int orderItemPrice;
	public int getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}
	public String getOrderItemName() {
		return orderItemName;
	}
	public void setOrderItemName(String orderItemName) {
		this.orderItemName = orderItemName;
	}
	public int getOrderItemPrice() {
		return orderItemPrice;
	}
	public void setOrderItemPrice(int orderItemPrice) {
		this.orderItemPrice = orderItemPrice;
	}
	@Override
	public String toString() {
		return "Item [orderItemId=" + orderItemId + ", orderItemName=" + orderItemName + ", orderItemPrice="
				+ orderItemPrice + "]";
	}
	public Item(int orderItemId, String orderItemName, int orderItemPrice) {
		super();
		this.orderItemId = orderItemId;
		this.orderItemName = orderItemName;
		this.orderItemPrice = orderItemPrice;
	}
	
	
	
	
}
