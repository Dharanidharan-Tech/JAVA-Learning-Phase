package chapter1;

public class ClassesAndObjects {

	public static void main(String[] str) {
		
		Book b1 = new Book();
		
		double book_price = b1.price;
		
		System.out.println(book_price);
		
		b1.displayPrice();
		
		Employee emp = new Employee("emp-1","abc",30000.00);
		
		System.out.println(emp.salary);
	}
}

class Book {
	
	double price = 1500.00;
	
	public void displayPrice() {
		
		System.out.println("Price : " + price);
	}
}




