package chapter1;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("Java");
		
		v.add(800);
		
		v.add(95.23);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			
			Object ob = e.nextElement();
			
			System.out.println(ob);
		}
		
		Object ob1 = v.elementAt(2);
		
		System.out.println(ob1);
	}
}
