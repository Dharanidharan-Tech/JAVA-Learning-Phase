package chapter1;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] str) {
		
		Set<String> st = new HashSet();
		
		//Hash value starts from 0.75 to endswith 16.0
		
		st.add("Java"); //2
		st.add("Hibernate"); //1.7
		st.add("HTML"); // 1.9
		st.add("CSS"); // 2.8
		st.add("CSS"); // 0.85
		st.add(null);
		
		System.out.println(st.hashCode());
		System.out.println(st);
		
		
		
		Iterator ite = st.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("*********************");
		
		Set<String> st1 = new HashSet();
		st1.add("Java Script");
		st1.add("Spring");
		st1.add("Spring Boot");
		
		st.addAll(st1);
		
		System.out.println(st);
		
		st.remove("Java Script");
		
		System.out.println(st);
		
		st.clear();
		
		System.out.println(st);
	
		System.gc();
	}
}

class Sample {
	
}






