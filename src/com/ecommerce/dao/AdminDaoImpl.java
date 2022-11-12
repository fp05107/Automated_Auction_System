package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.ecommerce.bean.Category;
import com.ecommerce.bean.Customers;
import com.ecommerce.bean.Orders;
import com.ecommerce.bean.Payments;
import com.ecommerce.bean.Products;
import com.ecommerce.bean.Shippers;
import com.ecommerce.bean.Suppliers;
import com.ecommerce.exception.AdminException;
import com.ecommerce.utility.DBUtil;
import com.mysql.cj.xdevapi.PreparableStatement;

public class AdminDaoImpl implements AdminDao {

	@Override
	public List<Customers> getAllCustomerDetails() throws AdminException {
		List<Customers> list = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from customers");

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				int customerId = rs.getInt("customerid");
				String firstName = rs.getString("firstname");
				String lastName = rs.getString("lastname");
				Date date_of_birth = rs.getDate("date_of_birth");
				String city = rs.getString("city");
				String state = rs.getString("state");
				String country = rs.getString("country");
				int postalcode = rs.getInt("postalcode");
				long phone = rs.getLong("phone");
				String email = rs.getString("email");
				Date dateEntered = rs.getDate("dateentered");

				Customers c = new Customers(customerId, firstName, lastName, date_of_birth, city, state, country,
						postalcode, phone, email, dateEntered);
				list.add(c);

			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminException();
		}

		return list;

	}

	@Override
	public List<Suppliers> getAllSupplierDetails() throws AdminException {

		List<Suppliers> list = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from suppliers");

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				int supplierid = rs.getInt("supplierid");
				String companyname = rs.getString("companyname");
				String city = rs.getString("city");
				String state = rs.getString("state");
				int postalcode = rs.getInt("postalcode");
				String country = rs.getString("country");
				long phone = rs.getLong("phone");
				String email = rs.getString("email");
				Suppliers s = new Suppliers(supplierid, companyname, city, state, postalcode, country, phone, email);

				list.add(s);

			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminException();
		}

		return list;
	}

	@Override
	public List<Products> getAllProductDetails() throws AdminException {
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
			throw new AdminException();
		}

		return list;
	}

	@Override
	public List<Payments> getAllPaymentsType() throws AdminException {
		List<Payments> list = new ArrayList<>();
		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from payments");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int paymentid = rs.getInt("paymentid");
				String paymenttype = rs.getString("paymenttype");
				String allowed = rs.getString("allowed");

				Payments p = new Payments(paymentid, paymenttype, allowed);
				list.add(p);

			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminException();
		}

		return list;
	}

	@Override
	public List<Orders> getAllOrdersDetail() throws AdminException {
		List<Orders> list = new ArrayList<>();
		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from orders");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int orderid = rs.getInt("orderid");
				int customerid = rs.getInt("customerid");
				int paymentid = rs.getInt("paymentid");
				Date orderdate = rs.getDate("orderdate");
				int shipperid = rs.getInt("shipperid");
				Date deliverydate = rs.getDate("deliverydate");
				int total_Order_amount = rs.getInt("total_order_amount");

				Orders o = new Orders(orderid, customerid, paymentid, orderdate, shipperid, deliverydate,
						total_Order_amount);
				list.add(o);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminException(e.getMessage());
		}

		return list;

	}

	@Override
	public List<Shippers> getAllShippersDetails() throws AdminException {
		List<Shippers> list = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from shippers");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int shipperid = rs.getInt("shipperid");
				String companyname = rs.getString("companyname");
				long phone = rs.getLong("phone");

				Shippers s = new Shippers(shipperid, companyname, phone);
				list.add(s);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminException();
		}

		return list;
	}

	@Override
	public List<Category> getAllCategoryDetails() throws AdminException {
		List<Category> list = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from category");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int categoryid = rs.getInt("categoryid");
				String categoryname = rs.getString("categoryname");
				String active = rs.getString("active");

				Category c = new Category(categoryid, categoryname, active);
				list.add(c);

			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminException();
		}
		return list;
	}

	@Override
	public void getAllDetailsOfOrdersPlacedIn(String date) {
		
		
		
	}

	@Override
	public void printNoOfShippersPresent() throws AdminException {

		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select COUNT(shipperid) from shippers");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int c = rs.getInt("COUNT(shipperid)");
				System.out.println(c);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminException();
		}

	}

	@Override
	public List<Orders> getAllDetailsOfOrdersWhichWerePlaceUsingPaymentMethod(int paymentid) throws AdminException {

		List<Orders> list = new ArrayList<>();
		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from orders where paymentid=?");
			ps.setInt(1, paymentid);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int orderid = rs.getInt("orderid");
				int customerid = rs.getInt("customerid");
				int paymentId = rs.getInt("paymentid");
				Date orderdate = rs.getDate("orderdate");
				int shipperid = rs.getInt("shipperid");
				Date deliverydate = rs.getDate("deliverydate");
				int total_Order_amount = rs.getInt("total_order_amount");

				Orders o = new Orders(orderid, customerid, paymentId, orderdate, shipperid, deliverydate,
						total_Order_amount);
				list.add(o);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminException(e.getMessage());
		}

		return list;

	}

	@Override
	public List<Customers> getAllDetailsOfCustomersWhosePhoneStartWith(int n) throws AdminException {
		
		List<Customers> list = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from customers where phone LIKE '9%'");

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				int customerId = rs.getInt("customerid");
				String firstName = rs.getString("firstname");
				String lastName = rs.getString("lastname");
				Date date_of_birth = rs.getDate("date_of_birth");
				String city = rs.getString("city");
				String state = rs.getString("state");
				String country = rs.getString("country");
				int postalcode = rs.getInt("postalcode");
				long phone = rs.getLong("phone");
				String email = rs.getString("email");
				Date dateEntered = rs.getDate("dateentered");

				Customers c = new Customers(customerId, firstName, lastName, date_of_birth, city, state, country,
						postalcode, phone, email, dateEntered);
				list.add(c);

			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminException();
		}

		return list;
		
	}

	@Override
	public void loginAdminByPasswordAndAdminId(int adminid, long password) throws AdminException {

		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from admin where adminid=? and password=?");
			ps.setInt(1, adminid);
			ps.setLong(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int adminid2 = rs.getInt("adminid");
				long pass = rs.getLong("password");
				System.out.println("Admin Login Successfully");
			}
			else {
				System.out.println("Incorrect Details");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminException();
		}

	}

}
