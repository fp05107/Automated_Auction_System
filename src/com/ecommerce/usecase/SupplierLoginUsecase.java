package com.ecommerce.usecase;

import java.util.Scanner;

import com.ecommerce.dao.SuppliersDao;
import com.ecommerce.dao.SuppliersDaoImpl;
import com.ecommerce.exception.SuppliersException;

public class SupplierLoginUsecase {
	public static void supplierLoginUsecase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Supplierid: ");
		int supplierid = sc.nextInt();
		System.out.println("Enter email: ");
		String email = sc.next();
		
		SuppliersDao dao = new SuppliersDaoImpl();
		
		try {
			dao.LoginAsSupplierBySupplierIdAndEmail(supplierid, email);
		} catch (SuppliersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
