package com.ecommerce.bean;

public class Admin {

	private int adminId;
	private int password;
	private String email;
	public Admin(int adminId, int password, String email) {
		super();
		this.adminId = adminId;
		this.password = password;
		this.email = email;
	}
	
	public Admin() {
	
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", password=" + password + ", email=" + email + "]";
	}
	
	
}
