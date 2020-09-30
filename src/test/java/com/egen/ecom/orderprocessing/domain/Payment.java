package com.egen.ecom.orderprocessing.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.egen.ecom.shopping.cart.domain.Address;

@Entity
public class Payment {
	
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	private int paymentId;	
	private int confirmationNumber;
	private Address billingaddress;
	private double chargeAmount;
	private String cardNumber;
	private int paymentStatus;
	
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getConfirmationNumber() {
		return confirmationNumber;
	}
	public void setConfirmationNumber(int confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
	public Address getBillingaddress() {
		return billingaddress;
	}
	public void setBillingaddress(Address billingaddress) {
		this.billingaddress = billingaddress;
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
	public int getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(int paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public Payment(int paymentId, int confirmationNumber, Address billingaddress, double chargeAmount,
			String cardNumber, int paymentStatus) {
		super();
		this.paymentId = paymentId;
		this.confirmationNumber = confirmationNumber;
		this.billingaddress = billingaddress;
		this.chargeAmount = chargeAmount;
		this.cardNumber = cardNumber;
		this.paymentStatus = paymentStatus;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", confirmationNumber=" + confirmationNumber + ", billingaddress="
				+ billingaddress + ", chargeAmount=" + chargeAmount + ", cardNumber=" + cardNumber + ", paymentStatus="
				+ paymentStatus + "]";
	}
	
	

}
