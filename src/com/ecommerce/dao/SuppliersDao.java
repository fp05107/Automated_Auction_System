package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.bean.Customers;
import com.ecommerce.exception.SuppliersException;

public interface SuppliersDao {
	
	public void LoginAsSupplierBySupplierIdAndEmail() throws SuppliersException;
	
	public List<Customers> getAllCustomerDetails();
	
	public void PrintTheAverageSalePriceAndTheAverageMarketPriceOfProductsProducedByTheBrand(String brand)throws SuppliersException;
	
	public void PrintOrderID_CustomerID_FirstName_EmailAndTotalOrderAmountForAllOrdersPlaced()throws SuppliersException;
	
	public void printAllCityNamesOfCustomers()throws SuppliersException;
	
	public void printCustomerId_TotalOrderAmountOfTopCustomers(int top)throws SuppliersException;
	
	

}
