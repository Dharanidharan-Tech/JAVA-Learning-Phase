package chapter1;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] str) {
		
		SortedSet ts = new TreeSet();
		
		ts.add("Coimbatore");
		ts.add("Erode");
		ts.add("Madurai");
		ts.add("Chennai");
		ts.add("Bangalore");
		ts.add("Madurai");
		
		Iterator ite = ts.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}
