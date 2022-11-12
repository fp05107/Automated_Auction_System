package com.ecommerce.usecase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ecommerce.bean.Payments;
import com.ecommerce.dao.AdminDao;
import com.ecommerce.dao.AdminDaoImpl;
import com.ecommerce.exception.AdminException;
import com.ecommerce.utility.DBUtil;

public class AdminGetAllPaymentDetails {
	
	public static void adminGetAllPaymentDetails() {
		
		AdminDao dao = new AdminDaoImpl();
		
		try {
			List<Payments> list = dao.getAllPaymentsType();
			
			list.forEach(e -> System.out.println(e));
		} catch (AdminException e) {
			e.printStackTrace();
		}
		
		
	}

}
