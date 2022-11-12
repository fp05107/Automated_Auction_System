package com.ecommerce.usecase;

import java.util.List;

import com.ecommerce.bean.Category;
import com.ecommerce.dao.AdminDao;
import com.ecommerce.dao.AdminDaoImpl;
import com.ecommerce.exception.AdminException;

public class AdminGetAllCategoryDetails {

	public static void  adminGetAllCategoryDetails() {
		
		AdminDao dao = new AdminDaoImpl();
		try {
			List<Category> list = dao.getAllCategoryDetails();
			list.forEach(e -> System.out.println(e));
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
