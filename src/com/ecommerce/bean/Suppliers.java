package com.ecommerce.bean;

public class Suppliers {

	private int supplierId;
	private String companyName;
	private String city;
	private String state;
	private int postalCode;
	private String country;
	private long phone;
	private String email;
	
	public Suppliers() {
		// TODO Auto-generated constructor stub
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Suppliers(int supplierId, String companyName, String city, String state, int postalCode, String country,
			long phone, String email) {
		super();
		this.supplierId = supplierId;
		this.companyName = companyName;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Suppliers [supplierId=" + supplierId + ", companyName=" + companyName + ", city=" + city + ", state="
				+ state + ", postalCode=" + postalCode + ", country=" + country + ", phone=" + phone + ", email="
				+ email + "]";
	}
	
	

}
