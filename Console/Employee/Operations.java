package console.employee;

import java.util.*;

public class Operations {
	Scanner s = new Scanner(System.in);
	ArrayList<Employee> al = new ArrayList<>();
	Employee e1 = new Employee(100, "Ananthi", 10000, "9090908989", "ananthi@gmail.com");
	Employee e2 = new Employee(101, "Monisha", 20000, "9090111989", "moni@gmail.com");

	public Operations() {
		al.add(e1);
		al.add(e2);
	}

	public void showOptions() {
		Operations op = new Operations();
		boolean b = true;

		while (b) {
			System.out.println("1)Add new Employee\n" + "2)SearchEmployeeById\n" + "3)Remove Employee\n"
					+ "4)showEmployeeList\n" + "5)UpdateEmployee\n6)Exit\n");
			int op1 = s.nextInt();
			switch (op1) {
			case 1:
				op.addNewEmployee();
				break;
			case 2:
				op.searchEmployeeById();
				break;
			case 3:
				op.removeEmployee();

				break;
			case 4:
				op.showEmployeeList();
				break;
			case 5:
				op.updateEmployee();
				break;
			case 6:
				b = false;
				exit();
				break;
			}

		}

	}

	public void addNewEmployee() {
		System.out.println("Enter id:");
		int id = s.nextInt();
		System.out.println("Enter name:");
		String name = s.next();
		System.out.println("Enter salary:");
		int salary = s.nextInt();
		System.out.println("Enter mobile number:");
		String contact_no = s.next();
		System.out.println("Enter mail_id:");
		String mail_id = s.next();
		System.out.println("You are added to the employee database");
		Employee employee = new Employee(id, name, salary, contact_no, mail_id);
		al.add(employee);

	}

	public void searchEmployeeById() {
		// Employee employee = new Employee();
		boolean check = false;
		System.out.println("Enter id:");
		int id = s.nextInt();

		for (Employee e : al) {
			if (e.getId() == id) {
				check = true;
				System.out.println("ID:"+e.getId() + "\n " +"Name:" +e.getName() + "\n " +"Salary"+ e.getSalary() + "\n " +"Mobile_number:"+ e.getContact_no()
						+ "\n " +"Mail_id:"+ e.getEmail_id() + "\n");
			}

		}
		if (check == false) {
			System.out.println("Sorry Wrong Credentials..!");
			searchEmployeeById();
		}

	}

	public void removeEmployee() {
		System.out.println("Enter Employee Id:");
		int id = s.nextInt();
		for (Employee e : al) {
			if (e.getId() == id) {
				al.remove(e);
			} else {
				System.out.println("Invalid Employee Id");
				System.out.println("\nRe-enter Employee Id");
				removeEmployee();
			}
			System.out.println(e.getId() + "removed from employee list");
		}

	}

	public void showEmployeeList() {

		for (Employee em : al) {

			System.out.println("ID:" + em.getId() + " " + "Name:" + em.getName() + " " + "Salary" + em.getSalary() + " "
					+ "Mobile number:" + em.getContact_no() + " " + "Mail_Id:" + em.getEmail_id() + " ");

		}

	}
	public void updateEmployee() {
		
		System.out.println("Enter the id:");
		int id =s.nextInt();
		System.out.println("enter the Newcontact Number:");
		String contactNumber=s.next();
			for(Employee e : al) {
				
	    if(e!=null && id==e.getId()) {
	 	    e.setContact_no(contactNumber);
	        System.out.println(e);
	        break;
	    
	    }
			}
			}
	


	public void exit() {
		System.out.println("bye!");

	}

}
