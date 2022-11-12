package com.ecommerce.usecase;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.ecommerce.utility.DBUtil;

public class SignUpAsCustomer {
	
	public static void signUpAsCustomer() {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter CustomerId: ");
		int customerId = sc.nextInt();
		System.out.println("Enter First name: ");
		String firstName = sc.next();
		System.out.println("Enter Last name: ");
		String lastName = sc.next();
		System.out.println("Enter City:  ");
		String city = sc.next();
		System.out.println("Enter State:  ");
		String state = sc.next();
		System.out.println("Enter Country: ");
		String country = sc.next();
		System.out.println("Enter PostalCode: ");
		int postalCode = sc.nextInt();
		System.out.println("Enter Phone: ");
		long phone = sc.nextLong();
		System.out.println("Enter email: ");
		String email = sc.next();
		
		try (Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?,?)");
			
			ps.setInt(1, customerId);
			ps.setString(2, firstName);
			ps.setString(3, lastName);
			ps.setString(4, city);
			ps.setString(5, state);
			ps.setString(6, country);
			ps.setInt(7, postalCode);
			ps.setLong(8, phone);
			ps.setString(9, email);
			
			int x = ps.executeUpdate();
			if(x>0) {
				System.out.println("SignUp Successfull");
			}
			else {
				System.out.println("Some error Occurs....");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
