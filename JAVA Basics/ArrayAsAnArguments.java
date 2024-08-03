package chapter1;

public class ArrayAsAnArguments {

	public static void main(String[] args) {
		
		int[] y = {10,20,30,40};
		
		processArray(y); //Function call
		
		int[] z = getArray(y);
		
		for(int i=0; i<z.length; i++) {
			
			System.out.println(z[i]);
		}
	}
	
	//function definition
	public static void processArray (int[] x) {
		
		for(int i=0; i<x.length; i++) {
			
			System.out.println(x[i]);
		}
		
		
	}
	
	public static int[] getArray(int[] x) {
		
		int[] y = new int[x.length];
		
		int a = 0;
		
		for(int i=x.length-1; i>=0; i--) {
			
			y[a++] = x[i];
		}
		
		return y;
	}
}
