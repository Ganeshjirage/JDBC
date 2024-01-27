package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCdelete {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Justdoit@6490");
			PreparedStatement state = con.prepareStatement("delete from employee where id = ?");

			// state.setInt(1, 4);
			state.setString(1, "3");

			state.executeUpdate();
			System.out.println("Successfully deleted");

			state.close();
			con.close();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

}
