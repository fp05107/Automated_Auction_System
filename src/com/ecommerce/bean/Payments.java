package com.ecommerce.bean;

public class Payments {
	

	private int paymentId;
	private String paymentType;
	private String allowed;
	
	public Payments() {
		// TODO Auto-generated constructor stub
	}

	public Payments(int paymentId, String paymentType, String allowed) {
		super();
		this.paymentId = paymentId;
		this.paymentType = paymentType;
		this.allowed = allowed;
	}

	@Override
	public String toString() {
		return "Payments [paymentId=" + paymentId + ", paymentType=" + paymentType + ", allowed=" + allowed + "]";
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getAllowed() {
		return allowed;
	}

	public void setAllowed(String allowed) {
		this.allowed = allowed;
	}
	
}
