package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.bean.Customers;
import com.ecommerce.exception.SuppliersException;

public interface SuppliersDao {
	
	public void LoginAsSupplierBySupplierIdAndEmail(int supplierid,String email) throws SuppliersException;
	
	public List<Customers> getAllCustomerDetails() throws SuppliersException;
	
	public void PrintTheAverageSalePriceAndTheAverageMarketPriceOfProductsProducedByTheBrand(String brand)throws SuppliersException;
	
	public void PrintOrderID_CustomerID_FirstName_EmailAndTotalOrderAmountForAllOrdersPlaced()throws SuppliersException;
	
	public void printAllCityNamesOfCustomers()throws SuppliersException;
	
	public void printCustomerId_TotalOrderAmountOfTopCustomers(int top)throws SuppliersException;
	
	

}
