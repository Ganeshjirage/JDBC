package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCRetrive {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Justdoit@6490");
			PreparedStatement state = con.prepareStatement("select * from employee");

			ResultSet rs = state.executeQuery();

			while (rs.next()) {
				System.out.println("Id - " + rs.getInt(1));
				System.out.println("UserName - " + rs.getString(2));
				System.out.println("Password - " + rs.getString(3));
				System.out.println();
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

}
