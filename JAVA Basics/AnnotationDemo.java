package chapter1;

import java.util.ArrayList;
import java.util.List;

public class AnnotationDemo {

	public static void main(String[] args) {

		@SuppressWarnings("unchecked")
		List<String> lst = new ArrayList();
		
		Annoat1 an = new Annoat1();
		an.calc1();
		an.calc2();
		
		Thread t1 = new Thread();
		t1.resume();
		
		Annoat2 an2 = new Annoat2();
		an2.display();
	}
}

@FunctionalInterface
interface CollegeDept {
	
	public void showDepartment();
	//public void showDepartment1();
}

class Annoat1 {
	
	int x = 100 , y = 200;
	
	@Deprecated
	public void calc1() {
		
		System.out.println(x+y);
	}
	
	public void calc2() {
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
	}
	
	public void display() {
		
		System.out.println("Class Annoat-1");
	}
	
}

class Annoat2 extends Annoat1 {
	
	@Override
	public void display() {
		
		System.out.println("Class Annoat-2");
	}
}













