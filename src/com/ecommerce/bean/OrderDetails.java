package com.ecommerce.bean;

public class OrderDetails {

	private int orderDetailId;
	private int orderId;
	private int productId;
	private int quantity;
	private int supplierId;
	
	public OrderDetails() {
		// TODO Auto-generated constructor stub
	}

	public int getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderDetailId=" + orderDetailId + ", orderId=" + orderId + ", productId=" + productId
				+ ", quantity=" + quantity + ", supplierId=" + supplierId + "]";
	}

	public OrderDetails(int orderDetailId, int orderId, int productId, int quantity, int supplierId) {
		super();
		this.orderDetailId = orderDetailId;
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.supplierId = supplierId;
	}
	
	
}
