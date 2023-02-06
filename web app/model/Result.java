package model;

public class Result {
	    private int user_id;
	    private String question;
	    private String correctAnswer;
	    private String userAnswer;
	    private String date;
	    
	    
		public Result(int user_id, String question, String correctAnswer, String userAnswer, String date) {
			this.user_id = user_id;
			this.question = question;
			this.correctAnswer = correctAnswer;
			this.userAnswer = userAnswer;
			this.date = date;
		}
		
		public Result() {
			
		}

		public int getUser_id() {
			return user_id;
		}
		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}
		public String getCorrectAnswer() {
			return correctAnswer;
		}
		public void setCorrectAnswer(String correctAnswer) {
			this.correctAnswer = correctAnswer;
		}
		public String getUserAnswer() {
			return userAnswer;
		}
		public void setUserAnswer(String userAnswer) {
			this.userAnswer = userAnswer;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
	    
	    
}