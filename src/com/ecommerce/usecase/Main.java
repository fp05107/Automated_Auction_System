package com.ecommerce.usecase;

import java.util.List;
import java.util.Scanner;

import com.ecommerce.bean.Customers;
import com.ecommerce.dao.AdminDao;
import com.ecommerce.dao.AdminDaoImpl;
import com.ecommerce.exception.AdminException;
import com.ecommerce.exception.SuppliersException;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter 1 to Login as Admin");
			System.out.println("Enter 2 to Login as Supplier");
			System.out.println("Enter 3 to Login as Customer");
			System.out.println("Enter 4 to SignUp as Admin");
			System.out.println("Enter 5 to SignUp as Supplier");
			System.out.println("Enter 6 to SignUp as Customer");
			System.out.println("Enter 7 to Exit");

			int userType = sc.nextInt();

			if (userType == 1) {
				AdminLoginUsecase.loginAdmin();

				while (true) {

					System.out.println("Enter 1 to show all customer details");
					System.out.println("Enter 2 to show all supplier details");
					System.out.println("Enter 3 to show all product details");
					System.out.println("Enter 4 to show all payment details");
					System.out.println("Enter 5 to show all order details");
					System.out.println("Enter 6 to show all shipper details");
					System.out.println("Enter 7 to show all category details");
					System.out.println("Enter 8 to get all order details placed in the given date");
					System.out.println("Enter 9 to print no. of shipper present");
					System.out.println("Enter 10 to get all order details placed using given payment method");
					System.out.println("Enter 11 to get all customer details whose phone start with given number");

					int adminOperationType = sc.nextInt();
					if (adminOperationType == 1) {

						AdminGetAllCustomerDetails.adminGetAllCustomerDetails();
					} else if (adminOperationType == 2) {
						AdminGetAllSupplierDetails.adminGetAllSupplierDetails();
					} else if (adminOperationType == 3) {
						AdminGetAllProductDetailsUsecase.adminGetAllProductDetailsUsecase();
					} else if (adminOperationType == 4) {
						AdminGetAllPaymentDetails.adminGetAllPaymentDetails();
					} else if (adminOperationType == 5) {
						AdminGetAllOrderDetails.adminGetAllOrderDetails();
					} else if (adminOperationType == 6) {
						AdminGetAllShipperDetails.adminGetAllShipperDetails();
					} else if (adminOperationType == 7) {
						AdminGetAllCategoryDetails.adminGetAllCategoryDetails();
					} else if (adminOperationType == 8) {

					} else if (adminOperationType == 9) {
						AdminPrintNumberOfShipperPresent.adminPrintNumberOfShipperPresent();
					} else if (adminOperationType == 10) {
						AdminGetAllDetailsOfOrdersWhichWerePlaceUsingGivenPaymentId
								.adminGetAllDetailsOfOrdersWhichWerePlaceUsingGivenPaymentId();

					} else if (adminOperationType == 11) {
						AdminGetAllDetailsOfCustomersWhosePhoneStartWith
								.adminGetAllDetailsOfCustomersWhosePhoneStartWith();
					}
				}

			} else if (userType == 2) {

				SupplierLoginUsecase.supplierLoginUsecase();

				while (true) {

					System.out.println("Enter 1 to Get All Customer Details");
					System.out.println(
							"Enter 2 to PrintTheAverageSalePriceAndTheAverageMarketPriceOfProductsProducedByTheBrand ");
					System.out.println("Enter 3 to Print All Order Details");
					System.out.println("Enter 4 to get all the city names of customers ");
					System.out.println("Enter 5 to Print the top customers");

					int supplier = sc.nextInt();
					if (supplier == 1) {
						SupplierGetAllCustomerDetails.supplierGetAllCustomerDetails();
					} else if (supplier == 2) {
						SupplierAverageSalePriceAndMarketPriceOfGivenBrand
								.supplierAverageSalePriceAndMarketPriceOfGivenBrand();
					} else if (supplier == 3) {
						SupplierPrintOrderDetails.supplierPrintOrderDetails();
					} else if (supplier == 4) {
						SupplierGetAllCityNamesOfCustomers.supplierGetAllCityNamesOfCustomers();
					} else if (supplier == 5) {
						SupplierPrintTheTopCustomers.supplierPrintTheTopCustomers();
					} else {
						System.out.println("Invalid Input..........");
					}

				}

			} else if (userType == 3) {

			} else if (userType == 4) {
				try {
					SignUpAsAdmin.signUpAsAdmin();
				} catch (AdminException e) {
					e.printStackTrace();
				}

			} else if (userType == 5) {
				SignUpAsSupplier.signUpAsSupplier();

			} else if (userType == 6) {
				SignUpAsCustomer.signUpAsCustomer();

			} else if (userType == 7) {
				System.out.println("Thank You");
				System.exit(1);
			} else {
				System.out.println("Invalid Input");
			}
		}

	}
}
