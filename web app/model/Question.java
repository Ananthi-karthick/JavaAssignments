package model;

public class Question {
	    
	    private int qid;
	    private String question;
	    private String a;
	    private String b;
	    private String c;
	    private String d;
	    private String correctAnswer;
	    public String getQuestion() {
	        return question;
	    }
	    public void setQuestion(String question) {
	        this.question = question;
	    }
	    public String getA() {
	        return a;
	    }
	    public void setA(String a) {
	        this.a = a;
	    }
	    public String getB() {
	        return b;
	    }
	    public void setB(String b) {
	        this.b = b;
	    }
	    public String getC() {
	        return c;
	    }
	    public void setC(String c) {
	        this.c = c;
	    }
	    public String getD() {
	        return d;
	    }
	    public void setD(String d) {
	        this.d = d;
	    }
	    
	
		public String getCorrectAnswer() {
			return correctAnswer;
		}
		public void setCorrectAnswer(String correctAnswer) {
			this.correctAnswer = correctAnswer;
		}
		public int getQid() {
			return qid;
		}
		public void setQid(int qid) {
			this.qid=qid;
			
		}
		
}
