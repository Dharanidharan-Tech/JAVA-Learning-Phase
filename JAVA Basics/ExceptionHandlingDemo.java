package chapter1;

public class ExceptionHandlingDemo {

	public static void main(String[] str) {
		
		System.out.println("welcome");
		
		int[] x = new int[3];
		
		try{
			
			x[0] = 100;
			
			x[1] = 200;
			
			x[2] = 300;
			
			x[3] = 400; //catch and throw
		
		}catch(Exception obj) {
			
			obj.printStackTrace(); //print error message
			System.out.println(obj.getMessage());
		
		}finally {
			
			System.out.println("This is finally block");
		}
		
		for(int index=0; index < x.length; index++) {
			
			System.out.println(x[index]);
		}
		
		System.out.println("Thank you");
	}
}
