package chapter1;

public class Sim1 extends Thread{

	Mobile m;
	
	public Sim1(Mobile m1) {
		
		m = m1;
	}
	
	public void run() {
		
		m.display(100);
	}
}
