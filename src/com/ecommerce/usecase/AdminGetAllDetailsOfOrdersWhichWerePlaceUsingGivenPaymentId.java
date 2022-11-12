package com.ecommerce.usecase;

import java.util.List;
import java.util.Scanner;

import com.ecommerce.bean.Orders;
import com.ecommerce.dao.AdminDao;
import com.ecommerce.dao.AdminDaoImpl;
import com.ecommerce.exception.AdminException;

public class AdminGetAllDetailsOfOrdersWhichWerePlaceUsingGivenPaymentId {
	
	public static void adminGetAllDetailsOfOrdersWhichWerePlaceUsingGivenPaymentId() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter PaymentId: ");
		int paymentId = sc.nextInt();
		
		AdminDao dao = new AdminDaoImpl();
		try {
			List<Orders> list = dao.getAllDetailsOfOrdersWhichWerePlaceUsingPaymentMethod(paymentId);
			list.forEach(e-> System.out.println(e));
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
