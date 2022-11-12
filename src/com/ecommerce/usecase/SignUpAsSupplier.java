package com.ecommerce.usecase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.ecommerce.utility.DBUtil;

public class SignUpAsSupplier {

	public static void signUpAsSupplier() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter SupplierId:  ");
		int supplierid = sc.nextInt();
		System.out.println("Enter Company name:  ");
		String companyName = sc.next();
		System.out.println("Enter City: ");
		String city = sc.next();
		System.out.println("Enter State:  ");
		String state = sc.next();
		System.out.println("Enter postal code: ");
		int postalCode = sc.nextInt();
		System.out.println("Enter Country:  ");
		String country = sc.next();
		System.out.println("Enter Phone:  ");
		long phone = sc.nextLong();
		System.out.println("Enter Your Email:  ");
		String email = sc.next();

		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("insert into suppliers values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, supplierid);
			ps.setString(2, companyName);
			ps.setString(3, city);
			ps.setString(4, state);
			ps.setInt(5, postalCode);
			ps.setString(6, country);
			ps.setLong(7, phone);
			ps.setString(8, email);

			int x = ps.executeUpdate();

			if (x > 0) {
				System.out.println("Supplier Signup Successfully");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
