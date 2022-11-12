package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ecommerce.bean.Customers;
import com.ecommerce.exception.AdminException;
import com.ecommerce.exception.SuppliersException;
import com.ecommerce.utility.DBUtil;

public class SuppliersDaoImpl implements SuppliersDao {

	@Override
	public void LoginAsSupplierBySupplierIdAndEmail(int supplierid, String email) throws SuppliersException {

		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from suppliers where supplierid=? and email=?");
			ps.setInt(1, supplierid);
			ps.setString(2, email);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("Login Successfull");
			} else {
				System.out.println("Incorrect Details");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Customers> getAllCustomerDetails() throws SuppliersException {
		List<Customers> list = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from customers");

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				int customerId = rs.getInt("customerid");
				String firstName = rs.getString("firstname");
				String lastName = rs.getString("lastname");
				String city = rs.getString("city");
				String state = rs.getString("state");
				String country = rs.getString("country");
				int postalcode = rs.getInt("postalcode");
				long phone = rs.getLong("phone");
				String email = rs.getString("email");
				

				Customers c = new Customers(customerId, firstName, lastName, city, state, country,
						postalcode, phone, email);
				list.add(c);

			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new SuppliersException();
		}

		return list;
	}

	@Override
	public void PrintTheAverageSalePriceAndTheAverageMarketPriceOfProductsProducedByTheBrand(String brand)
			throws SuppliersException {

		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn
					.prepareStatement("select AVG(sale_price),AVG(market_price) from products where brand=?");

			ps.setString(1, brand);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int x = rs.getInt(0);
				int y = rs.getInt(1);

				System.out.println("Average Sale Price is " + x);
				System.out.println("Average Market Price is " + y);
			} else {
				System.out.println("Some error Occurs....");
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

	@Override
	public void PrintOrderID_CustomerID_FirstName_EmailAndTotalOrderAmountForAllOrdersPlaced()
			throws SuppliersException {

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn
					.prepareStatement("select orderid,customerid,firstname,email,total_order_amount from orders");

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int orderid = rs.getInt("orderid");
				int customerid = rs.getInt("customerid");
				String firstname = rs.getString("firstname");
				String email = rs.getString("email");
				int total_order_amount = rs.getInt("total_order_amount");

				System.out
						.println(orderid + " " + customerid + " " + firstname + " " + email + " " + total_order_amount);

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

	@Override
	public void printAllCityNamesOfCustomers() throws SuppliersException {

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select DISTINCT city from customers");

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String city = rs.getString(0);
				System.out.println(city);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void printCustomerId_TotalOrderAmountOfTopCustomers(int top) throws SuppliersException {

		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement(
					"select customerid,total_order_amount from orders order by total_order_amount LIMIT ?");

			ps.setInt(1, top);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int customerid = rs.getInt("customerid");
				int total_order_amount = rs.getInt("total_order_amount");

				System.out.println(customerid + " " + total_order_amount);

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}
