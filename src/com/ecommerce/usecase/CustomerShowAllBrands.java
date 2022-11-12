package com.ecommerce.usecase;

import java.util.Set;

import com.ecommerce.dao.CustomersDao;
import com.ecommerce.dao.CustomersDaoImpl;
import com.ecommerce.exception.CustomersException;

public class CustomerShowAllBrands {

	public static void customerShowAllBrands() {
		
		CustomersDao dao = new CustomersDaoImpl();
		try {
			Set<String> set = dao.showAllBrands();
			System.out.println(set);
		} catch (CustomersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
