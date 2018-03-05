
public class AdvanceTicket extends Ticket {
	
	public AdvanceTicket(double price, int ticketNum) {
		super(price, ticketNum);
		// TODO Auto-generated constructor stub
	}

	public double getPrice(int[] args) {
		
		int daysPurchased = 0; //How many days in advanced the ticket was purchased
		
		if(daysPurchased < 10) {
			System.out.println("The cost of the ticket is: $40");
		} else {
			System.out.println("The cost of the ticket is $30. Thank you for buying early.");
		}
		
		return ticketPrice;
	}
	
	public String toString() {
		
		return "Ticket No: " + getNumber() + ", Ticket Price: " + getPrice();
		
	}

}
