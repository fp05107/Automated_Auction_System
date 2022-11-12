package com.ecommerce.usecase;

import java.util.List;

import com.ecommerce.bean.Products;
import com.ecommerce.dao.CustomersDao;
import com.ecommerce.dao.CustomersDaoImpl;
import com.ecommerce.exception.CustomersException;

public class CustomerShowAllProducts {

	public static void customerShowAllProducts() {
		CustomersDao dao = new CustomersDaoImpl();
		try {
			List<Products> list = dao.showAllProducts();
			list.forEach(e -> System.out.println(e));
		} catch (CustomersException e) {
			e.printStackTrace();
		}

	}

}
