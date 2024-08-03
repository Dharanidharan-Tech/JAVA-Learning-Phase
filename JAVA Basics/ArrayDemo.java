package chapter1;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] str) {
		
		//Method #1
		
		int[] x = new int[3];
		
		x[1] = 300;
		
		x[0] = 500;
		
		int res = x[1];
		
		System.out.println(res);
		
		int size_of_array = x.length;
		
		System.out.println(size_of_array);
		
		for(int index=0; index < size_of_array; index++) {
			
			System.out.println(x[index]);
		}
		
		//Method #2
		
		char[] ch = {'a','b','c','d','e'};
		
		for(int index=0; index < ch.length; index++) {
			
			System.out.println(ch[index]);
		}
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter Total No.of Animals : ");
		
		int n = sc.nextInt();
		
		String[] animals = new String[n];
		
		for(int index=0; index < n; index++) {
			
			animals[index] = sc.next();
		}
		
		for(int index=0; index < animals.length; index++) {
			
			System.out.println(animals[index]);
		}
		
		Library lib = new Library();
		lib.showBook();
	}
}











