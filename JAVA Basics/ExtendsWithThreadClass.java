package chapter1;

public class ExtendsWithThreadClass {

	public static void main(String[] args) {
		
		ExtThread e1 = new ExtThread(100);
		
		e1.start();
		
		ExtThread e2 = new ExtThread(50);
		
		e2.start();
	}
}

//class ExtendsWithThreadClass end

class ExtThread extends Thread {
	
	int x;
	
	public ExtThread(int x1) {
		
		x = x1;
	}
	
	public void run() {
		
		for(int i=1; i<=5; i++) {
			
			System.out.println(x+i);
			
			try {
				
				Thread.sleep(3000);
				
			}catch(Exception obj) {
				
				obj.printStackTrace();
			}
		}
	}
}









