package com.egen.ecom.shopping.cart.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	

	
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	private int addressId;
		
	
	private String addressType;
	private String deliveryMethod;
	private String addreassLine1;
	private String addreassLine2;
	private String state;
	private String city;
	private String zip;		
	private Date createdDate;	
	private String createdBy;	
	private Date modifiedDate;	
	private String lastUpdatedBy;
	private Date lastUpdateDate;
	private String lastUpdateLogin;
	
	

	
	public String getDeliveryMethod() {
		return deliveryMethod;
	}


	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
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


	public String getAddressType() {
		return addressType;
	}


	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}


	public int getAddressId() {
		return addressId;
	}


	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}


	public String getAddreassLine1() {
		return addreassLine1;
	}


	public void setAddreassLine1(String addreassLine1) {
		this.addreassLine1 = addreassLine1;
	}


	public String getAddreassLine2() {
		return addreassLine2;
	}

	public void setAddreassLine2(String addreassLine2) {
		this.addreassLine2 = addreassLine2;
	}


	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}



	public Address() {
		
	}


	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressType=" + addressType
				+ ", addreassLine1=" + addreassLine1 + ", addreassLine2=" + addreassLine2 + ", state=" + state
				+ ", city=" + city + ", zip=" + zip + "]";
	}


	public Address(int addressId, String addressType, String addreassLine1, String addreassLine2,
			String state, String city, String zip) {
		super();
		this.addressId = addressId;		
		this.addressType = addressType;
		this.addreassLine1 = addreassLine1;
		this.addreassLine2 = addreassLine2;
		this.state = state;
		this.city = city;
		this.zip = zip;
	}



	
	
}
