package com.egen.ecom.shopping.cart.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ShoppingCart {
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	private int cartId;


	@OneToOne
	private Customer customer;

	@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<Orders> orders;
	
	@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<Payment> payment;


	
	private double totalCost;
	
	
	private Date createdDate;	
	private String createdBy;	
	private Date modifiedDate;	
	private String lastUpdatedBy;
	private Date lastUpdateDate;
	private String lastUpdateLogin;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Set<Orders> getOrders() {
		return orders;
	}
	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}
	public Set<Payment> getPayment() {
		return payment;
	}
	public void setPayment(Set<Payment> payment) {
		this.payment = payment;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public String getLastUpdateLogin() {
		return lastUpdateLogin;
	}
	public void setLastUpdateLogin(String lastUpdateLogin) {
		this.lastUpdateLogin = lastUpdateLogin;
	}
	@Override
	public String toString() {
		return "ShoppingCart [cartId=" + cartId + ", customer=" + customer + ", orders=" + orders + ", payment="
				+ payment + ", totalCost=" + totalCost + ",  createdDate=" + createdDate
				+ ", createdBy=" + createdBy + ", modifiedDate=" + modifiedDate + ", lastUpdatedBy=" + lastUpdatedBy
				+ ", lastUpdateDate=" + lastUpdateDate + ", lastUpdateLogin=" + lastUpdateLogin + "]";
	}
	public ShoppingCart(int cartId, Customer customer, Set<Orders> orders, Set<Payment> payment, double totalCost,
			String orderStatus, Date createdDate, String createdBy, Date modifiedDate, String lastUpdatedBy,
			Date lastUpdateDate, String lastUpdateLogin) {
		super();
		this.cartId = cartId;
		this.customer = customer;
		this.orders = orders;
		this.payment = payment;
		this.totalCost = totalCost;
	
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateLogin = lastUpdateLogin;
	}
	
	
	public ShoppingCart() {
		
	}
	
	

}
