
public class AdvanceTicket extends Ticket {
	
	public int getPrice(int[] args) {
		
		int daysPurchased = 0; //How many days in advanced the ticket was purchased
		
		if(daysPurchased < 10) {
			int ticketPrice = 40;
		} else {
			int ticketPrice = 30;
		}
		
		return ticketPrice;
	}

}
