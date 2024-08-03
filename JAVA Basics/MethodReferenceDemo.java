package chapter1;

//Support only functional interface

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		//: : scope resoultion operator
		
		//Constructor Method Reference		
		Reference r1 = TicketBooking :: new;
		r1.show();
		
		//Static Method Reference
		Reference r2 = TicketBooking :: ticketData;
		r2.show();
		
		//Normal Function Reference
		TicketBooking tb = new TicketBooking();
		Reference r3 = tb :: showSeatNo;
		r3.show();
	}
}

//class MethodReferenceDemo end

@FunctionalInterface
interface Reference {
	
	public void show();
}


class TicketBooking {

	public TicketBooking() {
		
		System.out.println("Train Name : Nilgiri Express..");
	}
	
	public static void ticketData() {
		
		System.out.println("Depature : Erode");
		System.out.println("Arrival : Chennai");
	}
	
	public void showSeatNo() {
		
		System.out.println("Seat No : S8-19");
	}
}







