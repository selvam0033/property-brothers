package com.egen.ecom.shopping.cart.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Payment {
	
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	private int paymentId;	
	private double confirmationNumber;


	@OneToOne
	private Address billingAddress;
	
	
	private double chargeAmount;
	private String cardNumber;
	private String paymentStatus;
	private Date createdDate;	
	private String createdBy;	
	private Date modifiedDate;	
	private String lastUpdatedBy;
	private Date lastUpdateDate;
	private String lastUpdateLogin;
	

	
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
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public double getConfirmationNumber() {
		return confirmationNumber;
	}
	public void setConfirmationNumber(double confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
	public Address getBillingaddress() {
		return billingAddress;
	}
	public void setBillingaddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public double getChargeAmount() {
		return chargeAmount;
	}
	public void setChargeAmount(double chargeAmount) {
		this.chargeAmount = chargeAmount;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	public Payment() {
		
	}
	
	public Payment(int paymentId, int confirmationNumber, Address billingAddress, double chargeAmount,
			String cardNumber, String paymentStatus) {
		super();
		this.paymentId = paymentId;
		this.confirmationNumber = confirmationNumber;
		this.billingAddress = billingAddress;
		this.chargeAmount = chargeAmount;
		this.cardNumber = cardNumber;
		this.paymentStatus = paymentStatus;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", confirmationNumber=" + confirmationNumber + ", billingAddress="
				+ billingAddress + ", chargeAmount=" + chargeAmount + ", cardNumber=" + cardNumber + ", paymentStatus="
				+ paymentStatus + "]";
	}
	
	

}
