package com.ecommerce.bean;

import java.sql.Date;

public class Orders {

	private int orderId;
	private int customerId;
	private int paymentId;
	private Date orderDate;
	private int shipperId;
	private Date deliveryDate;
	private int total_Order_Amount;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getShipperId() {
		return shipperId;
	}
	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public int getTotal_Order_Amount() {
		return total_Order_Amount;
	}
	public void setTotal_Order_Amount(int total_Order_Amount) {
		this.total_Order_Amount = total_Order_Amount;
	}
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customerId=" + customerId + ", paymentId=" + paymentId + ", orderDate="
				+ orderDate + ", shipperId=" + shipperId + ", deliveryDate=" + deliveryDate + ", total_Order_Amount="
				+ total_Order_Amount + "]";
	}
	public Orders(int orderId, int customerId, int paymentId, Date orderDate, int shipperId, Date deliveryDate,
			int total_Order_Amount) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.paymentId = paymentId;
		this.orderDate = orderDate;
		this.shipperId = shipperId;
		this.deliveryDate = deliveryDate;
		this.total_Order_Amount = total_Order_Amount;
	}
	
	

}
