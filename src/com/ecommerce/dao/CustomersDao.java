package com.ecommerce.dao;

import java.util.List;
import java.util.Set;

import com.ecommerce.bean.Customers;
import com.ecommerce.bean.Products;
import com.ecommerce.exception.CustomersException;

public interface CustomersDao {
	
	
	public void loginCustomerUsingCustomeridAndPhone(int customerid,long phone) throws CustomersException;
	
	public List<Products> showAllProducts()throws CustomersException;
	
	public Set<String> showAllBrands()throws CustomersException;
	
	public Set<String> showAllThePaymentTypeWhichAreAllowed()throws CustomersException;
	
	
	
}
