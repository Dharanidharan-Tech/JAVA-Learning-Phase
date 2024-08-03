package chapter1;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		
		//push , pop , peek
		
		st.push("Java");
		st.push("Hibernate");
		st.push("Spring");
		st.push("Spring Boot");
		
		System.out.println(st.peek());
		
		st.pop();
		System.out.println(st.peek());
		
		int x = 100;
		
		System.out.println(++x);
	}
}
