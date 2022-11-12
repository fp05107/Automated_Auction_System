package com.ecommerce.usecase;

import java.util.Set;

import com.ecommerce.dao.CustomersDao;
import com.ecommerce.dao.CustomersDaoImpl;
import com.ecommerce.exception.CustomersException;

public class CustomersShowAllPaymentTypeWhichAreAllowed {

	public static void customersShowAllPaymentTypeWhichAreAllowed() {
		
		CustomersDao dao = new CustomersDaoImpl();
		
		try {
			Set<String> set = dao.showAllThePaymentTypeWhichAreAllowed();
			System.out.println(set);
		} catch (CustomersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
