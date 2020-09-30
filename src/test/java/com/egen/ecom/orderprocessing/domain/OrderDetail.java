package com.egen.ecom.orderprocessing.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.egen.ecom.shopping.cart.domain.Address;
import com.egen.ecom.shopping.cart.domain.Item;

@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private Item item;
    private int itemQty;
    private double totalPrice;
    private Address shippingAddress;
    private double iteamTotalPrice;
    private double shippingPrice;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getItemQty() {
		return itemQty;
	}
	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public double getIteamTotalPrice() {
		return iteamTotalPrice;
	}
	public void setIteamTotalPrice(double iteamTotalPrice) {
		this.iteamTotalPrice = iteamTotalPrice;
	}
	public double getShippingPrice() {
		return shippingPrice;
	}
	public void setShippingPrice(double shippingPrice) {
		this.shippingPrice = shippingPrice;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", item=" + item + ", itemQty=" + itemQty + ", totalPrice=" + totalPrice
				+ ", shippingAddress=" + shippingAddress + ", iteamTotalPrice=" + iteamTotalPrice + ", shippingPrice="
				+ shippingPrice + "]";
	}
	public OrderDetail(Integer id, Item item, int itemQty, double totalPrice, Address shippingAddress,
			double iteamTotalPrice, double shippingPrice) {
		super();
		this.id = id;
		this.item = item;
		this.itemQty = itemQty;
		this.totalPrice = totalPrice;
		this.shippingAddress = shippingAddress;
		this.iteamTotalPrice = iteamTotalPrice;
		this.shippingPrice = shippingPrice;
	}
    
    
    
    
    
    
}
