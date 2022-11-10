package com.ecommerce.bean;

public class Category {


	private int categoryId;
	private String categoryName;
	private String active;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(int categoryId, String categoryName, String active) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.active = active;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", active=" + active + "]";
	}
	
	
}
