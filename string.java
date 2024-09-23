package org.smart;

public class string {
	public static void main(String[]args) {
		
		String a = "kamaraj";
		String c = "KAMARAJ";
		char charAt = a.charAt(2);
		System.out.println(charAt);
		
		int b =a.indexOf("j");
		System.out.println(b);
		
		int lastIndexOf = a.lastIndexOf("r");
		System.out.println(lastIndexOf);
		
		int length = a.length();
		System.out.println(length);
		
		boolean empty = a.isEmpty();
		System.out.println(empty );
		
		boolean contains = a.contains(a);
		System.out.println(contains);
		
		String trim = a.trim();
		System.out.println(trim);
		
		String upperCase = a.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = a.toLowerCase();
		System.out.println(lowerCase );
		
		boolean startsWith = a.startsWith("ka");
		System.out.println( startsWith);
		
		boolean endsWith = a.endsWith("ma");
		System.out.println(endsWith);
		
		boolean equals = a.equals(c);
		System.out.println( equals);
		
		boolean equalsIgnoreCase = a.equalsIgnoreCase(c);
		System.out.println(equalsIgnoreCase);
		
		String replace = a.replace("j", "p");
		System.out.println(replace);
		
		String replaceAll = a.replaceAll("kamaraj", "kannan");
		System.out.println(replaceAll);
		
		String substring = a.substring(3);
		System.out.println(substring);
		
		String substring2 = a.substring(1, 5);
		System.out.println(substring2);
		
		int compareTo = a.compareTo("k");
		System.out.println(compareTo );
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	}

}
