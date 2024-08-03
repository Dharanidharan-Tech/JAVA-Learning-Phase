package chapter1;

import java.util.*;

public class QueueDemo {

	public static void main(String[] str) {
		
		//Queue<String> que = new ArrayDeque(); //Type Inference
		
		Deque<String> que = new ArrayDeque();
		que.add("Spring Boot");
		que.add("Spring");		
		que.add("Hibernate");
		que.add("C Plus Plus");
		
		
		//System.out.println(que.peek());
		
		que.remove();
		
		Iterator<String> ite = que.iterator();
		
		while(ite.hasNext()) {
			
			System.out.println(ite.next());
		}
		
	}
}










