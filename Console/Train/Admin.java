package console.train;

import java.util.*;

import java.sql.*;

public class Admin {
	private String adminid = "admin@5555";
	private String password = "southernrailway@123";

	Scanner getInput = new Scanner(System.in);

	public void viewTrainList() {
		PreparedStatement stmt = null;
		try {
			stmt = JDBC.jdbcConnection().prepareStatement("select * from train");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				System.out.println("TrainNo :" + rs.getInt("trainno") + "TrainName :" + rs.getString("train_name")
						+ "TrainFrom:" + rs.getString("train_from") + " TrainTo: " + rs.getString("train_to")
						+ "TicketCount: " + rs.getInt("ticket_count") + "TicketCost: " + rs.getString("ticket_cost"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void addTrain() {

		System.out.println("Enter Train Name : ");
		String trainname = getInput.next();
		System.out.println("Enter Train From : ");
		String trainfrom = getInput.next();
		// sc.next();
		System.out.println("Enter Train  To : ");
		String trainto = getInput.next();
		System.out.println("Enter Ticket  Nos: ");
		int ticketno = getInput.nextInt();
		System.out.println("Enter Ticket Rate in Rs₹ : ");
		int ticketrate = getInput.nextInt();
		System.out.println("Added Successfully");

		PreparedStatement getQuery = null;
		try {
			getQuery = JDBC.jdbcConnection().prepareStatement("insert into train values(?,?,?,?,?,?)");
			TrainDetails train = new TrainDetails();
			getQuery.setInt(1, train.getTrainNo());
			getQuery.setString(2, trainname);
			getQuery.setString(3, trainfrom);
			getQuery.setString(4, trainto);
			getQuery.setInt(5, ticketno);
			getQuery.setInt(6, ticketrate);
			getQuery.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	boolean checkCondition = true;

	public void ticket() {
		while (checkCondition) {
			System.out.println("\n1.BookTicket\n2.SearchTrain\n3.Back");
			int ipt = getInput.nextInt();
			
			switch (ipt) {
			case 1: {
				
				Operation operation=new Operation();
				operation.bookticket();
				break;
			}
			case 2: {
				Operation operation=new Operation();
				operation.searchTrain();
							}

			case 3: {
				checkCondition = false;
				break;
			}

			}

		}

	}

	

	public void login() {
		boolean checkCondition;
		System.out.println("->Enter Loginid :");
		String adminMailId = getInput.next();
		System.out.println("->Enter password:");
		String adminPassword = getInput.next();
		if (adminid.equals(adminMailId) && adminPassword.equals(password)) {
			checkCondition = true;
			while (checkCondition) {

				System.out.println("Welcome Admin\n");
				System.out.println("1.Add Trains\n2.View Trains\n3.View Customers\n4.Back");
				int choice = getInput.nextInt();
				// c=false;
				switch (choice) {
				case 1: {
					addTrain();
					break;
				}
				case 2: {
					viewTrainList();
					break;
				}

				case 3: {
					User user = new User();
					user.userList();
					break;
				}
				case 4: {
					Operation operation = new Operation();
					checkCondition = false;
					operation.function();
					break;
				}

				}

			}
		} else
			System.out.println("Worng Credentials...!");

	}

}
