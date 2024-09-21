package org.emp;

public class Employee {
	private void empId() {
		System.out.println("E21IT026");
	
	}
	private void empName() {
		System.out.println("Kamaraj");
	}
	private void empDOB() {
		System.out.println("14.06.2004");
	}
	private void empPhone() {
		System.out.println("9563573557");
	}
	private void empEmail() {
		System.out.println("kamarajtm@gmail.com");
	}
	private void empAddress() {
		System.out.println("Pullipalayam,Sankari,Salem,TamilNadu");
	}
	public static void main(String[]args) {
		Employee a  = new Employee();
		a.empId();
		a.empName();
		a.empDOB();
		a.empPhone();
		a.empEmail();
		a.empAddress();
	}
}
