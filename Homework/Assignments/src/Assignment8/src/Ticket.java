
public class Ticket {

	public int ticketNum; //Ticket number
	
	public double ticketPrice; //The price per ticket
	
	//Construct the ticket class
	public Ticket(double price, int ticketNum) {
		this.ticketPrice = price;
		this.ticketNum = ticketNum;
	}
	
	//Method to get the ticket price
	public double getPrice() {
		
		return ticketPrice;
	}
	
	//Method to get the ticket number
	public int getNumber() {
		
		return ticketNum;
	}

	
}
