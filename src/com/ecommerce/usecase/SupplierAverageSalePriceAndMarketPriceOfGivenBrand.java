package com.ecommerce.usecase;

import java.util.Scanner;

import com.ecommerce.dao.SuppliersDao;
import com.ecommerce.dao.SuppliersDaoImpl;
import com.ecommerce.exception.SuppliersException;

public class SupplierAverageSalePriceAndMarketPriceOfGivenBrand {
	
	public static void supplierAverageSalePriceAndMarketPriceOfGivenBrand() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the brand name: ");
		String brand = sc.next();
		SuppliersDao dao = new SuppliersDaoImpl();
		
		try {
			dao.PrintTheAverageSalePriceAndTheAverageMarketPriceOfProductsProducedByTheBrand(brand);
		} catch (SuppliersException e) {
			e.printStackTrace();
		}
		
	}
	
}
