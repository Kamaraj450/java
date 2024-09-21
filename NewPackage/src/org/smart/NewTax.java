package org.smart;

public class NewTax extends OldTax {
	
	public void taxlimit(int tax) {
		System.out.println("new tax limit"+tax);
		super.taxlimit(200000);
		
	}
		
	
		
		public static void main(String[]args) {
		
			NewTax a = new NewTax();
			
			a.taxlimit(500000);
		}
		// TODO Auto-generated method stub

	}
	


