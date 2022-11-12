package com.ecommerce.usecase;

import java.util.Scanner;

import com.ecommerce.dao.AdminDao;
import com.ecommerce.dao.AdminDaoImpl;
import com.ecommerce.exception.AdminException;

public class AdminLoginUsecase {

	public static void loginAdmin() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter admin id: ");
		int adminId = sc.nextInt();
		System.out.println("Enter admin password: ");
		long password = sc.nextInt();
		AdminDao admindao = new AdminDaoImpl();

		try {
			admindao.loginAdminByPasswordAndAdminId(adminId, password);
		} catch (AdminException e1) {
			e1.printStackTrace();
		} finally {
			System.out.println("==============================");
		}

	}

	public static void main(String[] args) {

	}
}
