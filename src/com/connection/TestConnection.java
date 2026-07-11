package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostle", "root", "root");

			Statement st = con.createStatement();

			int n = st.executeUpdate("insert into hrooms(rname,rmem) values('kings',8)");

			if (n > 0) {
				System.out.println("Rows Affected : " + n);
			} else {
				System.out.println("Something Went Wrong");
			}

			st.close();
			con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}