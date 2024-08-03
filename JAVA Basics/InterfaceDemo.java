package chapter1;

abstract public class InterfaceDemo {

	public static void main(String[] str) {		
		
		InterClass ic = new InterClass();
		ic.display();
		ic.display1();
		
		Inter1 i1 = new InterClass();
		i1.display();
	
		Inter1 i2 = new Inter1() {
			
			public void display() {
				
				System.out.println("Hi " + msg);
			}
		};
		
		i2.display();
	}
	
	abstract public void calc();
}

interface Inter1 { 
	
	public void display(); 
	final String msg = "java";  
	
}

class InterClass implements Inter1 { 
	
	public void display() {
		
		System.out.println("welcome " + msg);
	}
	
	public void display1() {
		
		System.out.println("hello " + msg);
	}
}






