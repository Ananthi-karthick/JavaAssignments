package model;

public class Score {
	private String attendDate;
	private int user_id;
	private String user_name;
	private int score;
	
	
	public Score(String attendDate ,int user_id,String user_name, int score) {
		this.attendDate = attendDate;
		this.user_id = user_id;
		this.user_name=user_name;
		this.score = score;
	}

	public Score() {
		
	}

	public String getAttendDate() {
		return attendDate;
	}

	public void setAttendDate(String attendDate) {
		this.attendDate = attendDate;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
