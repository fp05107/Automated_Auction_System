package com.ecommerce.usecase;

import java.util.List;

import com.ecommerce.bean.Customers;
import com.ecommerce.dao.AdminDao;
import com.ecommerce.dao.AdminDaoImpl;
import com.ecommerce.exception.AdminException;

public class AdminGetAllCustomerDetails {
	
	public static void adminGetAllCustomerDetails() {
		
		AdminDao dao = new AdminDaoImpl();
		try {
			List<Customers> list = dao.getAllCustomerDetails();
			list.forEach(e -> System.out.println(e));
			System.out.println("===========================================");
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		adminGetAllCustomerDetails();
	}
	
}
