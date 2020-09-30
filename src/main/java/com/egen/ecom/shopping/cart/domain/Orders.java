package com.egen.ecom.shopping.cart.domain;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Orders {
	
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer orderId;


    @OneToOne
    private Item item;
    
    private int itemQty;
    
    private String orderStatus;
    
    
    
    private double totalPrice;

    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    private Address shippingAddress;    
 
    private double orderTax;
    private double shippingCharges;
	private Date createdDate;	
	private String createdBy;	
	private Date modifiedDate;	
	private String lastUpdatedBy;
	private Date lastUpdateDate;
	private String lastUpdateLogin;
	
	
	
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
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
	public double getOrderTax() {
		return orderTax;
	}
	public void setOrderTax(double orderTax) {
		this.orderTax = orderTax;
	}
	public double getShippingCharges() {
		return shippingCharges;
	}
	public void setShippingCharges(double shippingCharges) {
		this.shippingCharges = shippingCharges;
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
		return "Orders [orderId=" + orderId + ", item=" + item + ", itemQty=" + itemQty + ", totalPrice=" + totalPrice
				+ ", shippingAddress=" + shippingAddress + ", orderTax=" + orderTax + ", shippingCharges="
				+ shippingCharges + ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", modifiedDate="
				+ modifiedDate + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdateDate=" + lastUpdateDate
				+ ", lastUpdateLogin=" + lastUpdateLogin + "]";
	}
	public Orders(Integer orderId, Item item, int itemQty, double totalPrice, Address shippingAddress, double orderTax,
			double shippingCharges, Date createdDate, String createdBy, Date modifiedDate, String lastUpdatedBy,
			Date lastUpdateDate, String lastUpdateLogin) {
		super();
		this.orderId = orderId;
		this.item = item;
		this.itemQty = itemQty;
		this.totalPrice = totalPrice;
		this.shippingAddress = shippingAddress;
		this.orderTax = orderTax;
		this.shippingCharges = shippingCharges;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateLogin = lastUpdateLogin;
	}
	
	public Orders() {
		
	}
	
	
	
}
