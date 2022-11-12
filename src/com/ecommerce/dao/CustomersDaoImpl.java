package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ecommerce.bean.Customers;
import com.ecommerce.bean.Products;
import com.ecommerce.exception.AdminException;
import com.ecommerce.exception.CustomersException;
import com.ecommerce.utility.DBUtil;

public class CustomersDaoImpl implements CustomersDao {

	@Override
	public void loginCustomerUsingCustomeridAndPhone(int customerid, long phone) throws CustomersException {

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from customers where customerid=? AND phone=?");
			ps.setInt(1, customerid);
			ps.setLong(2, phone);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("Login Successfully");
			} else {
				throw new CustomersException("Invalid Credentials.........");
			}

		} catch (SQLException e) {
			throw new CustomersException(e.getMessage());

		}

	}

	@Override
	public List<Products> showAllProducts() throws CustomersException {
		List<Products> list = new ArrayList<>();
		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from products");

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				int productid = rs.getInt("productid");
				String product = rs.getString("product");
				int categoryid = rs.getInt("categoryid");
				String sub_category = rs.getString("sub_category");
				String brand = rs.getString("brand");
				int sale_price = rs.getInt("sale_price");
				int market_price = rs.getInt("market_price");
				String type = rs.getString("type");

				Products p = new Products(productid, product, categoryid, sub_category, brand, sale_price, market_price,
						type);

				list.add(p);

			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CustomersException();
		}

		return list;

	}

	@Override
	public Set<String> showAllBrands() throws CustomersException {

		Set<String> set = new HashSet<>();

		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select brand from products");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String brand = rs.getString("brand");
				System.out.println(brand);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return set;

	}

	@Override
	public Set<String> showAllThePaymentTypeWhichAreAllowed() throws CustomersException {
		Set<String> set = new HashSet<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select paymenttype from payments where allowed='yes'");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String ptype = rs.getString(0);
				System.out.println(ptype);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return set;
	}

}








