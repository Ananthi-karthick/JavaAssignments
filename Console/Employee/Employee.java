package console.employee;

class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", contact_no=" + contact_no
				+ ", email_id=" + email_id + "]";
	}

	int id;
	String name;
	int salary;
	String contact_no;
	String email_id;
	

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public String getContact_no() {
		return contact_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public Employee(int id, String name, int salary, String contact_no, String email_id) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.contact_no = contact_no;
		this.email_id = email_id;

	}

	public Employee() {

	}

}
