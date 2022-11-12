package com.ecommerce.usecase;

import com.ecommerce.dao.AdminDao;
import com.ecommerce.dao.AdminDaoImpl;
import com.ecommerce.exception.AdminException;

public class AdminPrintNumberOfShipperPresent {
	
	public static void adminPrintNumberOfShipperPresent() {
		
		AdminDao dao = new AdminDaoImpl();
		try {
			dao.printNoOfShippersPresent();
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
