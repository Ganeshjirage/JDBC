package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC1Insert {

	public static void main(String[] args) throws SQLException {
		try {

			String sql = "insert into user(FirstName, LastName, Address, City, Salary)"
					+ "values('Mininath', 'jirage', 'Baramati', 'Pune', 1500)";

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Justdoit@6490");

			Statement statement = con.createStatement();
			statement.executeUpdate(sql);

			System.out.println("Insertion successfully...");
			con.close();
			statement.close();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

}
