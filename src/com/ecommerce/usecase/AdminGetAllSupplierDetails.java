package com.ecommerce.usecase;

import java.util.List;

import com.ecommerce.bean.Suppliers;
import com.ecommerce.dao.AdminDao;
import com.ecommerce.dao.AdminDaoImpl;
import com.ecommerce.exception.AdminException;

public class AdminGetAllSupplierDetails {
	
	public static void adminGetAllSupplierDetails() {
		
		AdminDao dao = new AdminDaoImpl();
		
		try {
			List<Suppliers> list = dao.getAllSupplierDetails();
			list.forEach(e-> System.out.println(e));
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public static void main(String[] args) {
		
		adminGetAllSupplierDetails();
		
	}

}
