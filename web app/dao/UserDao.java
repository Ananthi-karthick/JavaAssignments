package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.JDBC;
import model.User;

public class UserDao {
	public static int doValidate(User user) {

		String username = user.getUserName();
		String password = user.getPassword();

		int user_id=0;
		try {

			Connection con = JDBC.createConnection();
			PreparedStatement preparedStatement = con
					.prepareStatement("Select user_id from User where user_name=? And password=?");
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				user_id =rs.getInt(1) ;
			} else {
				user_id=0;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return user_id;
	}

	public static boolean register(User user) {

		boolean status = false;
		try {

			Connection con = JDBC.createConnection();
			String sql = "insert into user(Name,email_id,contact_no,user_name,password) values(?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, user.getName());
			pst.setString(2, user.getEmail());
			pst.setLong(3, user.getContactNo());
			pst.setString(4, user.getUserName());
			pst.setString(5, user.getPassword());
			int val = pst.executeUpdate();
			if (val > 0) {
				status = true;
			} else {
				status = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static ArrayList<User> getAllRecords() {
		ArrayList<User> allUsers = new ArrayList<User>();
		try {
			
			Connection con = JDBC.createConnection();
			String sql = "select * from User";
			PreparedStatement pst = con.prepareStatement(sql);

			ResultSet rs = pst.executeQuery(sql);
			while (rs.next()) {
				User user = new User();
				user.setUserId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setContactNo((rs.getLong(4)));
				user.setUserName(rs.getString(5));
				user.setPassword(rs.getString(6));
				allUsers.add(user);
				
			}
			

		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return allUsers;
	}

	

	
	
}
