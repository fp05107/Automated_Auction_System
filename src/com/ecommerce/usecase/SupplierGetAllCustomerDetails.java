package com.ecommerce.usecase;

import java.util.List;

import com.ecommerce.bean.Customers;
import com.ecommerce.dao.SuppliersDao;
import com.ecommerce.dao.SuppliersDaoImpl;
import com.ecommerce.exception.SuppliersException;

public class SupplierGetAllCustomerDetails {

	public static void supplierGetAllCustomerDetails() {
		
		SuppliersDao dao = new SuppliersDaoImpl();
		
		
		try {
			List<Customers> list = dao.getAllCustomerDetails();
			list.forEach(e -> System.out.println(e));
		} catch (SuppliersException e) {
			e.printStackTrace();
		} 
		
	}
}
