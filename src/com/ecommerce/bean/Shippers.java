package com.ecommerce.bean;

public class Shippers {

	private int shipperId;
	private String companyName;
	private long phone;
	
	public Shippers() {
		// TODO Auto-generated constructor stub
	}

	public Shippers(int shipperId, String companyName, long phone) {
		super();
		this.shipperId = shipperId;
		this.companyName = companyName;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Shippers [shipperId=" + shipperId + ", companyName=" + companyName + ", phone=" + phone + "]";
	}

	public int getShipperId() {
		return shipperId;
	}

	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
}
