
public class StudentTicket extends Ticket {

	public StudentTicket(double price, int ticketNum) {
		super(price, ticketNum);
		// TODO Auto-generated constructor stub
	}

	int daysPurchased = 0; //How many days in advanced the ticket was purchased
	
	public double getPrice(double[] args) {
		
		if(daysPurchased < 10) {
			double ticketPrice = 40;
		} else {
			double ticketPrice = 30;
		}
		
		return ticketPrice * (0.5);
		
	}
	
	public String toString() {
		return "Ticket Number: " + getNumber() + ", Price: " + getPrice();
		
	}
	
}
