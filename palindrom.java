package org.smart;

public class palindrom {
public static void main(String[]args) {
		
		String a = "KAMARAJ";
		for (int i=a.length()-1;i>=0;i--) {
			System.out.println(a.charAt(i));
			
			a= a+a.charAt(i);
		}
			
		System.out.println(a);
		
		if(a.equals(a)) {
			
			System.out.println("palindrom");
		}
		
		else {
			System.out.println("non palindrom");
			
		}
	}

}



