package console.train;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Operation {
	User user = new User();
	Admin admin = new Admin();

	public void function() {

		boolean checkIf = true;
		while (checkIf) {
			int userinput = 0;
			boolean optionFails = false;
			Scanner getInput = new Scanner(System.in);

			do {

				System.out.println("1.Signup\n2.Login\n3.Admin Login\n4.Exit");
				System.out.println("Enter choice:");
				try {
					userinput = getInput.nextInt();
					if (userinput > 4)
						throw new Exception();
					else
						optionFails = true;
				}

				catch (Exception e) {
					System.out.println("please enter the correct choice");

					optionFails = true;

				}

			} while (optionFails == false);

			switch (userinput) {
			case 1:

				user.signUp();
				break;

			case 2:
				user.login();
				break;

			case 3:
				admin.login();
			case 4:
				checkIf = false;
				break;

			}

		}
	}

	public void bookticket() {
		Admin admin = new Admin();
		admin.viewTrainList();
		Scanner getInput = new Scanner(System.in);
		System.out.println("Enter the Train No");
		int train_no = getInput.nextInt();
		System.out.println("Enter no.of tickets:");
		int noOfTickets = getInput.nextInt();
		try {

			PreparedStatement ps1 = JDBC.jdbcConnection().prepareStatement(
					"update train set ticket_count =ticket_count-" + noOfTickets + " where trainno=?");
			ps1.setInt(1, train_no);
			int queryExecution = ps1.executeUpdate();
			PreparedStatement ps2 = JDBC.jdbcConnection()
					.prepareStatement("select ticket_cost,train_name from train where trainno=?");
			ps2.setInt(1, train_no);
			ResultSet rs = ps2.executeQuery();
			rs.next();
			int amt = rs.getInt(1);
			String s = rs.getString(2);
			int total_amount = amt * noOfTickets;
			System.out.println("booked successfully");
			System.out.println("Train No = " + train_no + "Train Name = " + s + "Total Amount  = " + total_amount

			);

		} catch (Exception e) {

			e.printStackTrace();
		}
		

	}

	public void searchTrain() {
		Scanner getInput = new Scanner(System.in);
		TrainDetails train = new TrainDetails();
		System.out.println("Enter From Location => : ");
		String trainfrom = getInput.next();
		System.out.println("Enter To  Location <= : ");
		String trainto = getInput.next();
		System.out.println("--------Available Trains------- ");

		System.out.println(
				"TrainNo    TrainName              From            To         TicketCount     Ticket Cost");
		try {
			PreparedStatement ps = JDBC.jdbcConnection()
					.prepareStatement("select * from train where train_from=? AND train_to=?");
			ps.setString(1, trainfrom);
			ps.setString(2, trainto);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {

				System.out.println(rs.getInt("trainno") + "    " + rs.getString("train_name") + "         "
						+ rs.getString("train_from") + "        " + rs.getString("train_to") + "           "
						+ rs.getInt("ticket_count") + "      " + rs.getString("ticket_cost"));
				System.out.println("---------------------------------------------------------");
			}
			
		System.out.println("select train number");
		int selectedtrain_No=getInput.nextInt();
		TrainDetails td = new TrainDetails();
		int num = td.setTrainno(selectedtrain_No);
		bookticket(num);
			
		} catch (Exception e) {
			e.printStackTrace();

		}
		
	}

	private void bookticket(int num) {
		Scanner getInput = new Scanner(System.in);
		System.out.println("Enter no.of tickets:");
		int noOfTickets = getInput.nextInt();
		try {

			PreparedStatement ps1 = JDBC.jdbcConnection().prepareStatement(
					"update train set ticket_count =ticket_count-" + noOfTickets + " where trainno=?");
			ps1.setInt(1, num);
			int queryExecution = ps1.executeUpdate();
			PreparedStatement ps2 = JDBC.jdbcConnection()
					.prepareStatement("select ticket_cost,train_name from train where trainno=?");
			ps2.setInt(1, num);
			ResultSet rs = ps2.executeQuery();
			rs.next();
			int amt = rs.getInt(1);
			String s = rs.getString(2);
			int total_amount = amt * noOfTickets;
			System.out.println("booked successfully");
			System.out.println("Train No = " + num + "Train Name = " + s + "Total Amount  = " + total_amount

			);

		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}
}
