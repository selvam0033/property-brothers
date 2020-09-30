package com.egen.ecom.shopping.cart.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	private int itemId;
	private String itemName;
	private int itemPrice;
	private Date createdDate;	
	private String createdBy;	
	private Date modifiedDate;	
	private String lastUpdatedBy;
	private Date lastUpdateDate;
	private String lastUpdateLogin;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
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
	public Item(int itemId, String itemName, int itemPrice, Date createdDate, String createdBy, Date modifiedDate,
			String lastUpdatedBy, Date lastUpdateDate, String lastUpdateLogin) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateLogin = lastUpdateLogin;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", createdDate="
				+ createdDate + ", createdBy=" + createdBy + ", modifiedDate=" + modifiedDate + ", lastUpdatedBy="
				+ lastUpdatedBy + ", lastUpdateDate=" + lastUpdateDate + ", lastUpdateLogin=" + lastUpdateLogin + "]";
	}	
	
	
	public Item() {
		
	}
}
