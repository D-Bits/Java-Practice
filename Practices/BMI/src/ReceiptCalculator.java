
public class ReceiptCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calculate total owed, 8% tax, and 15% tip
		int subtotal = 38 + 40 +30;
		double tax = subtotal * .08;
		double tip = subtotal * .15;
		double total = subtotal + tax + tip;
		
		//Print the bill
		System.out.println("Subtotal: " + "$" + subtotal);
		System.out.println("Tax: " + "$" + tax);
		System.out.println("Tip: " + "$" + tip);
		System.out.println("Total Bill: " + "$" + total);
		
		System.out.println("Pay up, asshole!");
	}

}
