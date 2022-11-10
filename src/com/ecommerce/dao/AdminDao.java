package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.bean.Category;
import com.ecommerce.bean.Customers;
import com.ecommerce.bean.Orders;
import com.ecommerce.bean.Payments;
import com.ecommerce.bean.Products;
import com.ecommerce.bean.Shippers;
import com.ecommerce.bean.Suppliers;

public interface AdminDao {

	public List<Customers> getAllCustomerDetails();

	public List<Suppliers> getAllSupplierDetails();

	public List<Products> getAllProductDetails();

	public List<Payments> getAllPaymentsType();

	public List<Orders> getAllOrdersDetail();

	public List<Shippers> getAllShippersDetails();

	public List<Category> getAllCategoryDetails();

	public void getAllDetailsOfOrdersPlacedIn(String date);

	public void printNoOfShippersPresent();

	public List<Orders> getAllDetailsOfOrdersWhichWerePlaceUsingPaymentMethod(int paymentid);

	public List<Customers> getAllDetailsOfCustomersWhosePhoneStartWith(int n);

}
