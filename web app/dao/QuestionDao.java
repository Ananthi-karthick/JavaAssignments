package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import model.JDBC;
import model.Question;

public class QuestionDao {
	public static boolean insertQuestion(Question question) {

		boolean status = false;
		try {

			Connection con = JDBC.createConnection();
			String sql = "insert into questions(question,option_a,option_b,option_c,option_d,correct_answer) values(?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, question.getQuestion().trim());
			pst.setString(2, question.getA());
			pst.setString(3, question.getB());
			pst.setString(4, question.getC());
			pst.setString(5, question.getD());
			pst.setString(6, question.getCorrectAnswer());

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


	public static JSONArray getRandomQuestions() {
		JSONArray jObj = new JSONArray();
		try {

			
			Connection con = JDBC.createConnection();
			String sql = "select question,option_a,option_b,option_c,option_d,correct_answer from questions order by rand() limit 15";

			PreparedStatement pst = con.prepareStatement(sql);

			ResultSet rs = pst.executeQuery(sql);
			while (rs.next()) {
				JSONObject jsonObj = new JSONObject();

				   jsonObj.put("question", rs.getString("question"));
			        jsonObj.put("option_a", rs.getString("option_a"));
			        jsonObj.put("option_b", rs.getString("option_b"));
			        jsonObj.put("option_c", rs.getString("option_c"));
			        jsonObj.put("option_d", rs.getString("option_d"));
			        jsonObj.put("correct_answer", rs.getString("correct_answer"));
                    jObj.put(jsonObj);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return jObj;
	

}
}
