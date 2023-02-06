package model;

public class User {
	private int userId;
	private String Name;
	private String email;
	private String userName;
	private String password;
	private long contactNo;
	
	public User(String name, String email, long contactNo,String userName, String password) {
	
		Name = name;
		this.email = email;
		this.userName=userName;
		this.password = password;
		this.contactNo = contactNo;
	}

	public User() {
		
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getId() {
		
		return null;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		
		return super.toString();
	}


	
	
}
