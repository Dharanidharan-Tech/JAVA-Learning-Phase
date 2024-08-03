package chapter1;

public class Sim2 extends Thread{

	Mobile m;
	
	public Sim2(Mobile m1) {
		
		m = m1;
	}
	
	public void run() {
		
		m.display(50);
	}
}
