package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.bean.Customers;

public interface SuppliersDao {
	
	public List<Customers> getAllCustomerDetails();
	
	public void PrintTheAverageSalePriceAndTheAverageMarketPriceOfProductsProducedByTheBrand(String brand);
	
	public void PrintOrderID_CustomerID_FirstName_EmailAndTotalOrderAmountForAllOrdersPlaced();
	
	public void printAllCityNamesOfCustomers();
	
	public void printCustomerId_TotalOrderAmountOfTopCustomers(int top);
	
	

}
