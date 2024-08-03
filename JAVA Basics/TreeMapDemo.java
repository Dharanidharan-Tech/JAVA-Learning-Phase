package chapter1;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] str) {
		
		Map tm = new TreeMap();
		
		tm.put("Name","ABC");
		tm.put("Rank", 1);
		tm.put("Mark", 96.52);
		tm.put("Name","DEF");
		tm.put(null, "hello");
		
		Set st = tm.keySet();
		Iterator ite = st.iterator();
		while(ite.hasNext()) {
			Object key = ite.next();
			Object value = tm.get(key);
			
			System.out.println("Key : " + key);
			System.out.println("Value : " + value);
		}
		
	}
}
