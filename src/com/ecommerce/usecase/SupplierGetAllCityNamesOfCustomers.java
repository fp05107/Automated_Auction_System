package com.ecommerce.usecase;

import com.ecommerce.dao.SuppliersDao;
import com.ecommerce.dao.SuppliersDaoImpl;
import com.ecommerce.exception.SuppliersException;

public class SupplierGetAllCityNamesOfCustomers {

	public static void supplierGetAllCityNamesOfCustomers() {
		
		SuppliersDao dao = new SuppliersDaoImpl();
		
		try {
			dao.printAllCityNamesOfCustomers();
		} catch (SuppliersException e) {
			e.printStackTrace();
		}
		
	}
	
}
