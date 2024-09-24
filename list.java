package org.smart;
import java.util.ArrayList;
import java.util.List;

public class list {
	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(10);
		a.add(true);
		a.add('n');
		a.add(null);
		a.add("kamaraj");
		a.add(23.56);
		a.add(10);
		
		int bb = a.size();
		System.out.println(bb);
		
		boolean contains = a.contains(true);
		System.out.println(contains );
		
		Object object = a.get(4);
		System.out.println( object );
		
		Object remove = a.remove(1);
		System.out.println( remove);
		
		int indexOf = a.indexOf(2);
		System.out.println(indexOf);
		
		System.out.println(a);
		System.out.println("=============");
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}
}
	
	


      


