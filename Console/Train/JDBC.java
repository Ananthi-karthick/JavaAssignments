package console.train;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {

	public static Connection jdbcConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/TrainTicketBooking", "root", "Password");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}
