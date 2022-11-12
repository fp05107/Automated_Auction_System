package com.ecommerce.usecase;

import java.util.List;

import com.ecommerce.bean.Orders;
import com.ecommerce.dao.AdminDao;
import com.ecommerce.dao.AdminDaoImpl;
import com.ecommerce.exception.AdminException;

public class AdminGetAllOrderDetails {
	
	public static void adminGetAllOrderDetails() {
		
		AdminDao dao = new AdminDaoImpl();
		try {
			List<Orders> list = dao.getAllOrdersDetail();
			list.forEach(e ->System.out.println(e));
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
