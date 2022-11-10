package com.ecommerce.bean;

public class Customers {

	
	private int customerId;
	private String firstName;
	private String lastName;
	private String date_Of_Birth;
	private String city;
	private String state;
	private String country;
	private int postalCode;
	private long phone;
	private String email;
	private String dateEntered;
	
	public Customers() {
		// TODO Auto-generated constructor stub
	}

	public Customers(int customerId, String firstName, String lastName, String date_Of_Birth, String city, String state,
			String country, int postalCode, long phone, String email, String dateEntered) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date_Of_Birth = date_Of_Birth;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
		this.phone = phone;
		this.email = email;
		this.dateEntered = dateEntered;
	}

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", date_Of_Birth=" + date_Of_Birth + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", postalCode=" + postalCode + ", phone=" + phone + ", email=" + email + ", dateEntered="
				+ dateEntered + "]";
	}

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

	public String getDate_Of_Birth() {
		return date_Of_Birth;
	}

	public void setDate_Of_Birth(String date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
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

	public String getDateEntered() {
		return dateEntered;
	}

	public void setDateEntered(String dateEntered) {
		this.dateEntered = dateEntered;
	}
	
	
}
