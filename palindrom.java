package org.mass;

import java.util.Scanner;

public class palindrom {
	 public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);

			System.out.print("Enter the name: ");

			String name = scan.nextLine();

			System.out.println("Name: "+ name);

			String name2 = "";
			
			// length

			
			int length = name.length();

			System.out.println("The Length is: " + length);

			// reverse
			
			for(int i = name.length()-1;i>=0;i--) {

				System.out.println(name.charAt(i));

				name2 = name2 + name.charAt(i);

			}
               //palindrom
			
			if(name2.equals(name)) {

				System.out.println("Its a Palindrome");

			}

			else {

				System.out.println("Its not a Palindrome");

			}

		}

	}


