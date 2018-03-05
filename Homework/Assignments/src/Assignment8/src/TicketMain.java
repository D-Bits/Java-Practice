/*
 * A program to calculate to cost of ticket sales, using inheritance
 * By Dana Lockwood
 * Using Java SE 8.1
 * 3/5/18
 */

//Create a superclass, that others will inherit from 
public class TicketMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create new objects from the subclasses
		WalkupTicket walkup1 = new WalkupTicket(50.00, 42);
		
		StudentTicket student1 = new StudentTicket(15.00, 23);
		
		AdvanceTicket advance1 = new AdvanceTicket(20.00, 12);
		
		//Print the ticket prices
		System.out.println("WALKUP TICKET: " + walkup1.toString()); //print the walkup ticket price
		
		System.out.println("STUDENT TICKET: " + student1.toString()); //print the student ticket price
		
		System.out.println("ADVANCE TICKET: " + advance1.toString()); //print the advance ticket price

	}

}
