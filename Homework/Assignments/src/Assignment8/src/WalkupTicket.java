
public class WalkupTicket extends Ticket { //Inherit from Ticket

	public WalkupTicket(double price, int ticketNum) {
		super(price, ticketNum);
		// TODO Auto-generated constructor stub
	}
	
	//Take from Ticket
	public double getPrice() {
		
		return super.getPrice() + 20.00; //Add a $20 fee for same-day purchases
				
	}
	
	//Convert the price to a string
	public String toString() {
		
		return "Ticket Number: " + getNumber() + ", Price: " + getPrice();
		
	}

}
