package com.ecommerce.bean;

public class Products {

	private int productId;
	private String product;
	private int categoryId;
	private String sub_Category;
	private String brand;
	private int sale_Price;
	private int market_Price;
	private String type;
	
	public Products() {
		// TODO Auto-generated constructor stub
	}

	public Products(int productId, String product, int categoryId, String sub_Category, String brand, int sale_Price,
			int market_Price, String type) {
		super();
		this.productId = productId;
		this.product = product;
		this.categoryId = categoryId;
		this.sub_Category = sub_Category;
		this.brand = brand;
		this.sale_Price = sale_Price;
		this.market_Price = market_Price;
		this.type = type;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getSub_Category() {
		return sub_Category;
	}

	public void setSub_Category(String sub_Category) {
		this.sub_Category = sub_Category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSale_Price() {
		return sale_Price;
	}

	public void setSale_Price(int sale_Price) {
		this.sale_Price = sale_Price;
	}

	public int getMarket_Price() {
		return market_Price;
	}

	public void setMarket_Price(int market_Price) {
		this.market_Price = market_Price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", product=" + product + ", categoryId=" + categoryId
				+ ", sub_Category=" + sub_Category + ", brand=" + brand + ", sale_Price=" + sale_Price
				+ ", market_Price=" + market_Price + ", type=" + type + "]";
	}
	

}
