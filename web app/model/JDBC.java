package model;

import java.sql.*;

public class JDBC {
	public static Connection createConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinequiz", "root", "Password");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}
}
