package emailApp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String deptName;
	private String emailName;
	private String emailDetails;
	private String companySuffix = "company";
	private String password;
	private int mailboxCapacity = 10;
	private int passwordLenght = 10;
	
	public Email() {
		this.firstName = getFirstName(firstName);
		this.lastName = getLastName(lastName);
		this.deptName = getDeptName(deptName);
		this.password = getPassword(passwordLenght);
		
		System.out.println("Creating email account for " + this.firstName + " " + this.lastName);
		
		emailName = this.firstName.toLowerCase() + this.lastName.toLowerCase() + "." + deptName + "@" + this.companySuffix + ".com";
		emailDetails = "\nMailbox capacity: " + this.mailboxCapacity + "GB. \nYour password is: " +this.password;
	}

	public String getFirstName(String name) {
		System.out.println("Please enter your first name: ");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		return firstName;
	}

	public String setFirstName(String firstName) {
		this.firstName = firstName;
		return this.firstName;
	}

	public String getLastName(String name) {
		System.out.println("Please enter your last name: ");
		Scanner sc = new Scanner(System.in);
		String lastName = sc.nextLine();
		return lastName;
	}

	public String setLastName(String lastName) {
		this.lastName = lastName;
		return this.lastName;
	}

	public String getDeptName(String deptName) {
		// asking for the dept the employee works for. 
				System.out.println("\nWhich department do you work in?");
				
				// Scanner to take in keyboard input 
				Scanner sc = new Scanner(System.in);
				String departmentName = sc.nextLine();
				
				boolean valid = true;
				
				char ch;
				
				for (int i = 0; i < departmentName.length(); i++) {
					ch = departmentName.charAt(i);
					// We have detected a non letter or non whitespace, end this right now.
					// Change flag to false and break the loop.
					if (!Character.isLetter(ch) && !Character.isWhitespace(ch)) {
						valid = false;
						System.out.println("Alphabetic letters only please\n");
						break;
					
					}
				}
				return departmentName;  
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/**
	 * Generate password
	 */
	public String getPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!£$%^&*()_+[] {}:@~;#<>?,./'";
		// finding the value of the array at any given random number, each value will represent a 
		// character of the array.
		char[] password = new char [length];
		
		for(int i=0; i<length; i++) {
			// generates a number between 0-1 so we cast it as an integer then x by length parameter
			int rand = (int) (Math.random() * passwordSet.length());
			// at the given position i assign it to a correlating character in the passwordSet array.
			password[i] = passwordSet.charAt(rand);
		}
		// password is a set of characters, needs to be modified as String 
		return new String (password);
	}

	public void setPassword(String password) {
		this.password = getPassword(passwordLenght);
	}
	
	public String displayInfo() {
		return "\nGenerating ... \n" + emailName + emailDetails;
	}
	
	
	
}
