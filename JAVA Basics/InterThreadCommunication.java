package chapter1;

public class InterThreadCommunication {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		b.deposit(5000.00);
		
		b.withdraw(7000.00);
	}
}

//class InterThreadCommunication end

class Bank {

	double capital = 1000.00;
	
	synchronized void deposit(double amount) {
		
		capital = capital + amount;
		
		System.out.println("Total Amount : " + capital);
		
		notify();
	}
	
	synchronized void withdraw(double amount) {
		
		if(amount <= capital) {
			
			capital = capital - amount;
			
			System.out.println("Withdraw Amount : " + amount);
			
			System.out.println("Available Balance : " + capital);
		
		}else {
			
			System.out.println("Insufficient balance ... ");
			
			try {
				
				wait();
				
			}catch(Exception obj) {
				
				obj.printStackTrace();
			}
		}
	}
	
}

//class Bank end








