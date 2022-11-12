package com.ecommerce.usecase;

import java.util.List;

import com.ecommerce.bean.Shippers;
import com.ecommerce.dao.AdminDao;
import com.ecommerce.dao.AdminDaoImpl;
import com.ecommerce.exception.AdminException;

public class AdminGetAllShipperDetails {

	public static void adminGetAllShipperDetails() {
		AdminDao dao = new AdminDaoImpl();
		
		
		try {
			List<Shippers> list = dao.getAllShippersDetails();
			list.forEach(e -> System.out.println(e));
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
