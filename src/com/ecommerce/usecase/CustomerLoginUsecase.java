package com.ecommerce.usecase;

import java.util.Scanner;

import com.ecommerce.dao.CustomersDao;
import com.ecommerce.dao.CustomersDaoImpl;
import com.ecommerce.exception.CustomersException;

public class CustomerLoginUsecase {

	public static void customerLoginUsecase() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customerid:  ");
		int customerid = sc.nextInt();
		System.out.println("Enter Phone Number: ");
		long phone = sc.nextLong();
		CustomersDao dao = new  CustomersDaoImpl();
		
		try {
			dao.loginCustomerUsingCustomeridAndPhone(customerid, phone);
		} catch (CustomersException e) {
			e.printStackTrace();
			customerLoginUsecase();
		}
		
	}
	
}
