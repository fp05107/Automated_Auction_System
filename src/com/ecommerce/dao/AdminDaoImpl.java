package com.ecommerce.dao;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.bean.Category;
import com.ecommerce.bean.Customers;
import com.ecommerce.bean.Orders;
import com.ecommerce.bean.Payments;
import com.ecommerce.bean.Products;
import com.ecommerce.bean.Shippers;
import com.ecommerce.bean.Suppliers;

public class AdminDaoImpl implements AdminDao{

	@Override
	public List<Customers> getAllCustomerDetails() {
		List<Customers> list = new ArrayList<>();
		
		
		return list;
		
	}

	@Override
	public List<Suppliers> getAllSupplierDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Products> getAllProductDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payments> getAllPaymentsType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> getAllOrdersDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Shippers> getAllShippersDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getAllCategoryDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getAllDetailsOfOrdersPlacedIn(String date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printNoOfShippersPresent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Orders> getAllDetailsOfOrdersWhichWerePlaceUsingPaymentMethod(int paymentid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customers> getAllDetailsOfCustomersWhosePhoneStartWith(int n) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
