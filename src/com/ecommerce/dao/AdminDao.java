package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.bean.Category;
import com.ecommerce.bean.Customers;
import com.ecommerce.bean.Orders;
import com.ecommerce.bean.Payments;
import com.ecommerce.bean.Products;
import com.ecommerce.bean.Shippers;
import com.ecommerce.bean.Suppliers;
import com.ecommerce.exception.AdminException;

public interface AdminDao {
	
	public void loginAdminByPasswordAndAdminId(int adminid,long password) throws AdminException;
	
	public List<Customers> getAllCustomerDetails() throws AdminException;

	public List<Suppliers> getAllSupplierDetails() throws AdminException;

	public List<Products> getAllProductDetails() throws AdminException;

	public List<Payments> getAllPaymentsType() throws AdminException;

	public List<Orders> getAllOrdersDetail() throws AdminException;

	public List<Shippers> getAllShippersDetails() throws AdminException;

	public List<Category> getAllCategoryDetails() throws AdminException;

	public void getAllDetailsOfOrdersPlacedIn(String date) throws AdminException;

	public void printNoOfShippersPresent() throws AdminException;

	public List<Orders> getAllDetailsOfOrdersWhichWerePlaceUsingPaymentMethod(int paymentid) throws AdminException;

	public List<Customers> getAllDetailsOfCustomersWhosePhoneStartWith(int n) throws AdminException;

}
