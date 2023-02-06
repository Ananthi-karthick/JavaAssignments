package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import model.JDBC;
import model.Result;


public class ResultDao {
	public static boolean insertResult(Result  result) throws SQLIntegrityConstraintViolationException
	{
		boolean status = false;
		try {

			Connection con = JDBC.createConnection();
			String sql = "insert into result values(?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, result.getUser_id());
			pst.setString(2, result.getQuestion());
			pst.setString(3, result.getCorrectAnswer());
			pst.setString(4, result.getUserAnswer());
			pst.setString(5, result.getDate());
			
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
	
	public static ArrayList<Result> viewResult(int user_id,String date) {
		ArrayList<Result> resultList=new ArrayList<Result>();
		try {

			Connection con = JDBC.createConnection();
			String sql = "select question,correct_answer,user_answer from result where user_id=? and attend_date=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, user_id);
			pst.setString(2, date);
			ResultSet resultSet=pst.executeQuery();
			while(resultSet.next()) {
				Result result=new Result();
				result.setQuestion(resultSet.getString(1));
				result.setCorrectAnswer(resultSet.getString(2));
				result.setUserAnswer(resultSet.getString(3));
				resultList.add(result);
			}

		}
		catch(Exception e) {
			
			e.printStackTrace();
		
			}
	
		return resultList;
}
	
	
}
