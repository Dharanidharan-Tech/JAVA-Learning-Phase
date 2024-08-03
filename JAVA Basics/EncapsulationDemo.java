package chapter1;

public class EncapsulationDemo {

	public static void main(String[] str) {
		
		LooselyCoupled lc = new LooselyCoupled();
		
		lc.display2();
		
		lc.display1();
		
		System.out.println(lc.student_name);
		
		TightlyCoupled tc = new TightlyCoupled();
		
		tc.setBookName();
		
		tc.displayBook();
	}
}

//class EncapsulationDemo end
