package chapter1;

public class SynchronizationDemo {

	public static void main(String[] args) {
		
		Mobile m2 = new Mobile();
		
		Sim1 s1 = new Sim1(m2);
		
		Sim2 s2 = new Sim2(m2);
		
		s1.start();
		
		s2.start();
	}
}

//class SynchronizationDemo end

class Mobile {

	synchronized void display(int x) {
		
		for(int i=1; i<=5; i++) {
			
			System.out.println(x+i);
			
			try {
				
				Thread.sleep(1000);
			
			}catch(Exception obj) {
				
				obj.printStackTrace();
			}
		}
	}
}









