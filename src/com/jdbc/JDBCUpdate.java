package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUpdate {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Justdoit@6490");

			PreparedStatement state1 = con.prepareStatement("update employee set username =? where id = ?");
			PreparedStatement state2 = con
					.prepareStatement("update employee set username =?, passwordd =? where id = ?");

			state1.setString(1, "Manisha");
			state1.setString(2, "2");

			state2.setString(1, "Gautam");
			state2.setString(2, "gautam@123");
			state2.setString(3, "3");

			int i = state1.executeUpdate();
			int x = state2.executeUpdate();

			state1.close();
			state2.close();
			con.close();
			System.out.println("successfully updated " + i);
			System.out.println("successfully updated " + x);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
