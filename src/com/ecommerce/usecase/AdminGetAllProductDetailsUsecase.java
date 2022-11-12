package com.ecommerce.usecase;

import java.util.List;
import java.util.Scanner;

import com.ecommerce.bean.Products;
import com.ecommerce.dao.AdminDao;
import com.ecommerce.dao.AdminDaoImpl;
import com.ecommerce.exception.AdminException;

public class AdminGetAllProductDetailsUsecase {

	public static void adminGetAllProductDetailsUsecase() {
		Scanner sc = new Scanner(System.in);

		AdminDao dao = new AdminDaoImpl();

		try {
			List<Products> list = dao.getAllProductDetails();

			list.forEach(e -> System.out.println(e));
		} catch (AdminException e) {

			e.printStackTrace();
		}

	}
}
