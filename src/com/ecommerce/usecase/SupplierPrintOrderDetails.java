package com.ecommerce.usecase;

import com.ecommerce.dao.SuppliersDao;
import com.ecommerce.dao.SuppliersDaoImpl;
import com.ecommerce.exception.SuppliersException;

public class SupplierPrintOrderDetails {

	public static void supplierPrintOrderDetails() {
		
		SuppliersDao dao = new SuppliersDaoImpl();
		
		try {
			dao.PrintOrderID_CustomerID_FirstName_EmailAndTotalOrderAmountForAllOrdersPlaced();
		} catch (SuppliersException e) {
			e.printStackTrace();
		}
		
	}
}
