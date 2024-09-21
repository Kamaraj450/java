package org.smart;



public class company {
	
	public void empData(String name) {
		System.out.println("emp name is:"+name );
		this.empData(5);
		this.empData('m');
		
	}
		
	public void empData(int age) {
		System.out.println("emp age is:"+age);
	}
	public static void main(String[]args) {
		
		company a= new company();
		
		 a.empData("clm");
		 a.empData(29);
		 
		 
         
		 
		
		 
		
		  
			
			
		}
		
		
		
		
			
			
	}
		
		
		

			
			
		
	


