package org.base;

public class company extends Employee  {
	
	public void compId() {
		System.out.println("comp id is 5026");
	}

	public void compname() { 
		System.out.println("comp name is wipro");
	}
	public static void main(String[]args) {
		
		company a= new company();
		   a.compId();
		   a.compname(); 
		   a.empId();
		   a.empname();
		   a.staffId();
		   
		    
			 
		}
	}

