package chapter1;

public class CustomExceptionDemo {

	public static void main(String[] args) throws Exception {
		
		double salary = 30000.00;
		String category = "c";
		
		if((category.equals("c")) && (salary <= 20000.00)) {
			
			System.out.println("Successfully credited ...");
		
		}else {
			
			throw new SalaryException();
			
		}
		
		System.out.println("ESI , PF , HRA Generated ...");
	}
}


class SalaryException extends Exception {
	
	public SalaryException() {
		
		//System.out.println("Check Category and Salary");
	}
}



