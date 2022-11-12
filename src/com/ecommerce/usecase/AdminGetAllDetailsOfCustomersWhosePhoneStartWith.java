package com.ecommerce.usecase;

import java.util.List;
import java.util.Scanner;

import com.ecommerce.bean.Customers;
import com.ecommerce.dao.AdminDao;
import com.ecommerce.dao.AdminDaoImpl;
import com.ecommerce.exception.AdminException;

public class AdminGetAllDetailsOfCustomersWhosePhoneStartWith {
	
	public static void adminGetAllDetailsOfCustomersWhosePhoneStartWith() {
		
		Scanner sc = new Scanner(System.in);
		
		
		AdminDao dao = new AdminDaoImpl();
		try {
			List<Customers> list = dao.getAllDetailsOfCustomersWhosePhoneStartWith(0);
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
