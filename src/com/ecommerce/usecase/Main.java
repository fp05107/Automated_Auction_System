package com.ecommerce.usecase;

import java.util.Scanner;

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

			} else if (userType == 2) {

			} else if (userType == 3) {

			} else if (userType == 4) {

			} else if (userType == 5) {

			} else if (userType == 6) {

			} else if (userType == 7) {

			} else {
				System.out.println("Please Enter valid details");

			}
		}

	}
}
