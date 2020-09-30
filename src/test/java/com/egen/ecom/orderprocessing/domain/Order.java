package com.egen.ecom.orderprocessing.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.egen.ecom.shopping.cart.domain.Customer;
import com.egen.ecom.shopping.cart.domain.Orders;
import com.egen.ecom.shopping.cart.domain.Payment;
@Entity
public class Order {
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	private int orderId;
	private List<Payment> payment;
	private List<Orders> orders;
	private Customer customer;
	private double totalCost;
	private String orderStatus;
	private String paymentStatus;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<Payment> getPayment() {
		return payment;
	}
	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}
	public List<Orders> getOrderDetail() {
		return orders;
	}
	public void setOrderDetail(List<Orders> orders) {
		this.orders = orders;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public Order(int orderId, List<Payment> payment, List<Orders> orders, Customer customer, double totalCost,
			String orderStatus, String paymentStatus) {
		super();
		this.orderId = orderId;
		this.payment = payment;
		this.orders = orders;
		this.customer = customer;
		this.totalCost = totalCost;
		this.orderStatus = orderStatus;
		this.paymentStatus = paymentStatus;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", payment=" + payment + ", orderDetail=" + orders + ", customer="
				+ customer + ", totalCost=" + totalCost + ", orderStatus=" + orderStatus + ", paymentStatus="
				+ paymentStatus + "]";
	}
	
	
	
	

}
