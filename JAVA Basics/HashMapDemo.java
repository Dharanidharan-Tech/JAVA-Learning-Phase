package chapter1;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] str) {
		
		Map hm = new HashMap();
		
		hm.put("Name", "abc");
		hm.put("Rank", 1);
		hm.put("Mark", null);
		hm.put(5,null);
		hm.put("Rank", 2);
		hm.put("Name1","abc");
		hm.put(null, "hello");
		hm.put(null, "welcome");
		hm.put("Mark", 92.13);
		//Get all keys from Map object
		
		Set st = hm.keySet();
		Iterator ite = st.iterator();
		while(ite.hasNext()) {
			Object key = ite.next();
			System.out.println("Key : " + key);
			
			Object value = hm.get(key);
			System.out.println("Value : " + value);
		}
		
		Map hm1 = new HashMap();
		
		String[] st1 = {"Roll No","Name","Email ID"};
		String[] st2 = {"st-1","abc","abc@gmail.com"};
		String[] st3 = {"st-2","def","def@gmail.com"};
		
		hm1.put(1, st1);
		hm1.put(2, st2);
		hm1.put(3, st3);
		
		Set st_stud = hm1.keySet();
		Iterator st_ite = st_stud.iterator();
		while(st_ite.hasNext()) {
			Object key = st_ite.next();
			String[] value = (String[])hm1.get(key);
			for(int index=0; index < value.length; index++) {
				System.out.print(value[index]+"\t");
			}
			
			System.out.println("\n********************************");
				
		}
	}
}













