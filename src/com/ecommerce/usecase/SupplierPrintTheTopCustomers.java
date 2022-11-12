package com.ecommerce.usecase;

import java.util.Scanner;

import com.ecommerce.dao.SuppliersDao;
import com.ecommerce.dao.SuppliersDaoImpl;
import com.ecommerce.exception.SuppliersException;

public class SupplierPrintTheTopCustomers {

	public static void supplierPrintTheTopCustomers() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int top = sc.nextInt();
		SuppliersDao dao = new SuppliersDaoImpl();
		try {
			dao.printCustomerId_TotalOrderAmountOfTopCustomers(top);
		} catch (SuppliersException e) {
			e.printStackTrace();
		}

	}
}
