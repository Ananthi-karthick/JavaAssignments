package com.consol.app.bank;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations {
	private String User_Name;
	private int Password;
	private String Acc_Holder_Name;
	private long Acc_No;
	private long ContactNo;
	private String EmailId;
	private long Current_Amount;
 
	public String getUser_Name() {
		return User_Name;
	}

	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}

	public int getPassword() {
		return Password;
	}

	public void setPassword(int password) {
		
		Password = password;
	}

	public String getAcc_Holder_Name() {
		return Acc_Holder_Name;
	}

	public void setAcc_Holder_Name(String acc_Holder_Name) {
		Acc_Holder_Name = acc_Holder_Name;
	}

	public long getAcc_No() {
		return Acc_No;
	}

	public void setAcc_No(long acc_No) {
		Acc_No = acc_No;
	}

	public long getContactNo() {
		return ContactNo;
	}

	public void setContactNo(long contact_No) {
		ContactNo = contact_No;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String email_Id) {
		EmailId = email_Id;
	}

	public long getCurrent_Amount() {
		return Current_Amount;
	}

	public void setCurrent_Amount(long Current_Amount) {
		this.Current_Amount = Current_Amount;
	}

	

	void mainMenu() throws ClassNotFoundException, SQLException

	{
		Scanner optionInput = new Scanner(System.in);
		System.out.println("1)Login\n2)SignUp\n3)Exit\n");
		int option = optionInput.nextInt();
		switch (option) {
		case 1:
			login();
			break;
		case 2:
			signUp();
			break;
		case 3:
			exit();
			break;
		}

	}

	private void login() throws ClassNotFoundException, SQLException {
		Scanner userInput = new Scanner(System.in);
		Operations ob = new Operations();
		System.out.println("Enter the User Name:");
		ob.setUser_Name(userInput.next());
		System.out.println("Enter password");
		ob.setPassword(userInput.nextInt());
		//userInput.nextLine();
		try {
			PreparedStatement ps = JDBC.jdbcConnection()
					.prepareStatement("select * from userInfo where User_Name=? AND Password=?");
			ps.setString(1, ob.User_Name);
			ps.setInt(2, ob.Password);
			ResultSet rs = ps.executeQuery();
			if (rs.next())
				System.out.println("Welcome " + ob.User_Name + "!!");
						else {
				System.out.println("Invalid user name and password");
				System.out.println("Re-enter userName and Passowrd!");
				login();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		secondPage();
	}

	void signUp() throws ClassNotFoundException, SQLException {
		Scanner userInput = new Scanner(System.in);
		Operations ob = new Operations();
		System.out.println("Enter the user_name:");
		ob.setUser_Name(userInput.next());
		System.out.println("Create password:");
		ob.setPassword(userInput.nextInt());
		System.out.println("Enter the Name:");
		ob.setAcc_Holder_Name(userInput.next());
		System.out.println("Initial amount:");
		ob.setCurrent_Amount(userInput.nextLong());
		System.out.println("Enter the mobile number:");
		ob.setContactNo(userInput.nextLong());
		System.out.println("Enter mail id:");
		ob.setEmailId(userInput.next());
		System.out.println("------------------------");
		System.out.println("Your Account is Created!");
		System.out.println("------------------------");
		PreparedStatement ps = null;
		try {

			ps = JDBC.jdbcConnection().prepareStatement("insert into userInfo values(?,?,?,?,?,?,?)");
			ps.setLong(1, ob.Acc_No);
			ps.setString(2, ob.Acc_Holder_Name);
			ps.setLong(3, ob.Current_Amount);
			ps.setLong(4, ob.ContactNo);
			ps.setString(5, ob.EmailId);
			ps.setString(6, ob.User_Name);
			ps.setInt(7, ob.Password);
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		ps.close();
		
end();

	}
private void exit() {
		System.out.println("Thank you!!");

	}

	public void secondPage() throws ClassNotFoundException, SQLException {
		Scanner processOption = new Scanner(System.in);
		System.out.println(
				"1)Show Account\n2)Balance Enquiry\n3)Deposit\n4)Withdrawal\n5)Exit\n");
		int choice = processOption.nextInt();
		switch (choice) {
		case 1:
			show_Account();
			break;
		case 2:
			balance_Enquiry();
			break;
		case 3:
			deposit();
			break;
		case 4:
			withdrawal();
			break;
		case 5:
			mainMenu();
			break;
		

		}
	}
	private void end() throws ClassNotFoundException, SQLException {
		Scanner terminateOption = new Scanner(System.in);
		Operations ob1 = new Operations();
		System.out.println("Do you want to continue...");
		System.out.println("1)Yes\t2)No");
		int choice = terminateOption.nextInt();

		if (choice == 1)
			ob1.secondPage();
		else
			System.out.println("Thank you!!");
	
	}
		

	public void show_Account() throws ClassNotFoundException, SQLException {
		Scanner userInput = new Scanner(System.in);
		Operations ob = new Operations();
		System.out.println("enter Account Number:");
		ob.setAcc_No(userInput.nextLong());
		try {

			PreparedStatement ps = JDBC.jdbcConnection().prepareStatement("select * from userInfo where Acc_No=?");
			ps.setLong(1, ob.Acc_No);
			ResultSet rs = ps.executeQuery();
			if (rs.next())
				System.out.println(
						"Account_Number:" + rs.getLong("Acc_No") + "\nAccount_Holder:" + rs.getString("Acc_Holder_Name")
								+ "\n" + "Balance:" + rs.getLong("Current_Amount") + "\n" + "Mobile_Number:"
								+ rs.getLong("ContactNo") + "\n" + "mail_id:" + rs.getString("EmailId") + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		end();

	}

	
	

	private void withdrawal() throws ClassNotFoundException, SQLException {
		Scanner userInput = new Scanner(System.in);
		Operations ob = new Operations();
		System.out.println("Enter the Acconut Number:");
		ob.setAcc_No(userInput.nextLong());
		System.out.println("Enter the amount:");
		int amt =userInput.nextInt();
		try {
			PreparedStatement ps = JDBC.jdbcConnection()
					.prepareStatement("select Current_Amount from userInfo  where Acc_No=? ");
			ps.setLong(1, ob.Acc_No);
			ResultSet rs = ps.executeQuery();
			rs.next();
			long balance = rs.getLong(1);
			if (balance > (amt + 1000)) {
				PreparedStatement ps1 = JDBC.jdbcConnection().prepareStatement(
						"update userInfo set Current_Amount=Current_Amount-" + amt + " where Acc_No=?");
				ps1.setLong(1, ob.getAcc_No());
				int i = ps1.executeUpdate();
				PreparedStatement ps2 = JDBC.jdbcConnection()
						.prepareStatement("select Current_Amount from userInfo  where Acc_No=? ");
				ps2.setLong(1, ob.getAcc_No());
				ResultSet rs3 = ps2.executeQuery();
				rs3.next();
				System.out.println(
						amt + " is withdrawed from your account\n" + "\nbalance=" + rs3.getLong("Current_Amount"));

			} else {
				System.out.println("Insufficient balance...");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
end();
	}

	private void deposit() throws ClassNotFoundException, SQLException {
		Scanner userInput = new Scanner(System.in);
		Operations ob = new Operations();
		System.out.println("Enter the Account Number:");
		ob.setAcc_No(userInput.nextLong());
		System.out.println("Enter the amount:");
		int amt = userInput.nextInt();
		try {
			PreparedStatement ps = JDBC.jdbcConnection()
					.prepareStatement("update userInfo set Current_Amount =Current_Amount+" + amt + " where Acc_No=?");
			ps.setLong(1, ob.Acc_No);
			long i = ps.executeUpdate();
			PreparedStatement ps1 = JDBC.jdbcConnection()
					.prepareStatement("select Current_Amount from userInfo  where Acc_No=? ");
			ps1.setLong(1, ob.Acc_No);
			ResultSet result = ps1.executeQuery();
			result.next();
			System.out.println(amt + " is depited to Account Number: " + ob.getAcc_No() + " account\n"
					+ "Available balance=" + result.getLong("Current_Amount"));
		} catch (Exception e) {
			e.printStackTrace();
		}
end();
	}

	private void balance_Enquiry() throws ClassNotFoundException, SQLException {
		Scanner userInput = new Scanner(System.in);
		Operations ob = new Operations();
		System.out.println("Enter the Account Number:");
		ob.setAcc_No(userInput.nextLong());
		try {
			PreparedStatement ps = JDBC.jdbcConnection()
					.prepareStatement("select Current_Amount from userInfo  where Acc_No=? ");
			ps.setLong(1, ob.Acc_No);
			ResultSet result = ps.executeQuery();
			result.next();
			System.out.println("Available balance=" + result.getLong("Current_Amount"));
		} catch (Exception e) {
			e.printStackTrace();

		}
end();
	}
}
