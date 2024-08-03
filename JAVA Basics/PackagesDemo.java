package chapter1;

import java.util.ArrayList;
import java.util.List;

import com.jgoodies.common.base.Preconditions;

/*import pack1.Sample1;
import pack1.Sample2; */

import pack1.*;
import pack1.pack2.Sample3;



public class PackagesDemo {

	public static void main(String[] str) {
		
		Sample1 s1 = new Sample1();
		s1.display1();
		
		Sample2 s2 = new Sample2();
		s2.display2();
		
		//Preconditions pc = new Preconditions(null,null);
		
		//List lst = new ArrayList();
		
		Sample3 s3 = new Sample3();
		s3.display3();
		
		
		pack4.Sample1 s4 = new pack4.Sample1();
		s4.display1();
		
		
		
	}
}

class Library {
	
	public void showBook() {
		
		System.out.println("Book Name : Java");
	}
}













