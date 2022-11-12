package com.ecommerce.usecase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.ecommerce.exception.AdminException;
import com.ecommerce.utility.DBUtil;

public class SignUpAsAdmin {

	public static void signUpAsAdmin() throws AdminException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter AdminId:  ");
		int adminid = sc.nextInt();
		System.out.println("Enter a Strong Password:   ");
		int password = sc.nextInt();
		System.out.println("Enter Your Email:  ");
		String email = sc.next();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("insert into admin values(?,?,?)");
			ps.setInt(1, adminid);
			ps.setInt(2, password);
			ps.setString(3, email);

			int x = ps.executeUpdate();
			if (x > 0) {
				System.out.println("Admin SignUp Successfully........");
			} else {
				System.out.println("Can't SignUp.....");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminException();
		}

	}

}
