package com.egen.ecom.shopping.cart.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Customer {
	
	
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)	
	private int customerId;
	private String firstName;
	private String lastName;
	
	private Date createdDate;	
	private String createdBy;	
	private Date modifiedDate;	
	private String lastUpdatedBy;
	private Date lastUpdateDate;
	private String lastUpdateLogin;


	@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<Address> address;


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
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


	public Set<Address> getAddress() {
		return address;
	}


	public void setAddress(Set<Address> address) {
		this.address = address;
	}


	public Customer(int customerId, String firstName, String lastName, Date createdDate, String createdBy,
			Date modifiedDate, String lastUpdatedBy, Date lastUpdateDate, String lastUpdateLogin,
			Set<Address> address) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateLogin = lastUpdateLogin;
		this.address = address;
	}
	
	public Customer() {
		
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", modifiedDate=" + modifiedDate
				+ ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdateDate=" + lastUpdateDate + ", lastUpdateLogin="
				+ lastUpdateLogin + ", address=" + address + "]";
	}
	
	


}
