package com.ecommerce.dao;

import java.util.List;
import java.util.Set;

import com.ecommerce.bean.Customers;
import com.ecommerce.bean.Products;

public interface CustomersDao {
	
	public List<Customers> loginCustomerUsingCustomeridAndPhone();
	
	public List<Products> showAllProducts();
	
	public Set<String> showAllBrands();
	
	public Set<String> showAllThePaymentTypeWhichAreAllowed();
	
	
}
