package chapter1;

public class StaticVariableDemo {

	public static void main(String[] str) {
		
		StaticVariable s1 = new StaticVariable();
		
		s1.display();
		
		StaticVariable s2 = new StaticVariable();
		
		s2.display();
		
		StaticVariable s3 = new StaticVariable();
		
		s3.display();
	}
}

class StaticVariable {
	
	static int x = 100;
	
	public void display() {
		
		x = x + 1;
		
		System.out.println(x);
	}
}
