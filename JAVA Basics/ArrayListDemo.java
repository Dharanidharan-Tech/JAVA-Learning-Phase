package chapter1;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] str) {
		
		List lst = new ArrayList();
		
		lst.add("welcome");
		
		lst.add(500);
		
		lst.add(12.34);
		
		lst.add(true);
		
		//Retrieve elements from Collection
		
		//Method #1 : Using While loop (Iterator , ListIterator)
		
		Iterator ite = lst.iterator();
		
		while(ite.hasNext()) {
			
			Object ob = ite.next();
			
			System.out.println(ob);
		}
		
		System.out.println("---------------------------");
		
		ListIterator lst_ite = lst.listIterator(lst.size());
		
		while(lst_ite.hasPrevious()) {
			
			Object ob = lst_ite.previous();
			
			System.out.println(ob);
		}
		
		System.out.println("---------------------------");
		
		//Method #2 : Using For Loop
		
		for(int index=0; index < lst.size(); index++) {
			
			Object ob = lst.get(index);
			
			System.out.println(ob);
		}
		
		System.out.println("---------------------------");
		
		
		//Method #3 : Enhanced For Loop / For Each Loop
		
		for(Object ob : lst) {
			
			System.out.println(ob);
		}
		
		System.out.println("---------------------------");
		
		//Method #4 : Enhanced For Each Loop
		
		lst.forEach(lst1 -> System.out.println(lst1));
		
		System.out.println("---------------------------");
		
		
		lst.forEach(System.out :: println); // :: scope resoultion operator
		
		System.out.println("---------------------------");
		
		lst.add(2,"Java");
		
		lst.forEach(System.out :: println); // :: scope resoultion operator
		
		System.out.println("---------------------------");
		
		lst.remove("Java");
		
		lst.forEach(System.out :: println); // :: scope resoultion operator
		
		System.out.println("---------------------------");
		
		lst.remove(2);
		
		lst.forEach(System.out :: println); // :: scope resoultion operator
		
		
		System.out.println("---------------------------");
		
	}
}
