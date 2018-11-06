package emailApp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String deptName;
	private String password;
	private int mailboxCapacity = 10;
	
	public Email() {
		
	}

	public String getFirstName() {
		System.out.println("Please enter your first name: ");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("Please enter your last name: ");
		Scanner sc = new Scanner(System.in);
		String lastName = sc.nextLine();
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDeptName() {
		System.out.println("Enter your department: ");
		Scanner sc = new Scanner(System.in);
		String dept = sc.nextLine();
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
