package chapter1;

public class ImplementsThread {

	public static void main(String[] args) {
		
		ImplThread i1 = new ImplThread(200);
		
		ImplThread i2 = new ImplThread(150);
		
		Thread t1 = new Thread(i1);
		
		Thread t2 = new Thread(i2);
		
		t1.start();
		
		t2.start();
	}
}

//class ImplementsThread end

class ImplThread implements Runnable {

	int x;
	
	public ImplThread(int x1) {
		
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