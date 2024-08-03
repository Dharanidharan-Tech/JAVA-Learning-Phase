package chapter1;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		int x = 100; //Right side value move to left side memory called Return
		
		College clg = new College();
		
		clg.showDepartment();
		
		new College();
		
		new College().showDepartment();
	}
}

//class ConstructorDemo end

class College {

	public College() {
		
		System.out.println("Nandha College of Engineering");
	}
	
	public void showDepartment() {
		
		System.out.println("Total Departments : 14");
	}
}










