package chapter1;

public class DefaultMethods {

	public static void main(String[] args) {
		
		EmployeeData ed = new EmployeeData() {};
		ed.showEmployee();
		
		
		EmployeeData.showEmployeeSalary();
		
		EmployeeData.Customer customer = new EmployeeData.Customer();
		customer.customerData();
		
		
	}
}


interface EmployeeData {
	
	default public void showEmployee() {
		
		System.out.println("Employee ID : EMP-1");
		System.out.println("employee Name : ABC");
	}
	
	public static void showEmployeeSalary() {
		
		System.out.println("Salary : 50000.00");
		
		class Sales {
			
			public void showSalesReport() {
				
				System.out.println("Bill No : B-1");
				System.out.println("Bill Date : 20.06.2024");
			}
		}
		
		Sales sale = new Sales();
		sale.showSalesReport();
	}
	
	class Customer {
		
		public void customerData() {
			
			System.out.println("Customer Name : ABC");
			System.out.println("Address : Erode");
		}
	}
	
}