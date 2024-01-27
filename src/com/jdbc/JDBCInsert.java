package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCInsert {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Justdoit@6490");

			PreparedStatement state = con.prepareStatement("insert into employee(username, passwordd) values (?,?)");

			state.setString(1, "Vilas");
			state.setString(2, "vilas@123");

			int i = state.executeUpdate();
			System.out.println("Execution done " + i);
			con.close();
			state.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
