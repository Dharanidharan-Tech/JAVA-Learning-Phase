package chapter1;

public class MultipleCatchBlocks {

	public static void main(String[] str) {
		
		int[] x = new int[3];
		
		try {
			
			x[0] = 100;
			
			x[1] = 200;
			
			int y = 5/0;	
			
			x[2] = 300;
		
			x[3] = 400; 	
		}
		
		catch(ArrayIndexOutOfBoundsException obj) {
			
			obj.printStackTrace();
		}
		
		catch(ArithmeticException obj) {
			
			obj.printStackTrace();
			
		} 
		
		catch(Exception obj) {
			
			obj.printStackTrace();
		}
		
		for(int i=0; i<x.length; i++) {
			
			System.out.println(x[i]);
		}
		
		
	}
}
