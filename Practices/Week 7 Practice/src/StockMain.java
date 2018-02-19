import java.util.Scanner;


public class StockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console = new Scanner(System.in);
		
		//First Stock
		System.out.println("Enter the first stock symbol: ");
		String symbol1 = console.next();
		String stock1 = new Stock(symbol1);
		double profit = makePurchases(stock1, console);
		
		//Second stock
		System.out.print("Enter first stock symbol: ");
		String symbol2 = console.next();
		Stock stock2= new Stock(symbol2);
		double profit2 = makePurchases(stock1, console);
		
		//make purchases of stock and return profit
		public static double makePruchases(Stock currentStock, Scanner console){
			
			System.out.print("How many purchases? ");
			int numPurchases = console.nextInt();
			
			//Ask about each purchase
			for(int i = 1; i < numPurchases; i++){
				System.out.println("How many shares, at what price per share? ");
				int numShares = console.nextInt();
				double pricePerShare = console.nextDouble();
				
			
			//Record purcahse
			currentStock.purchase(numShares, pricePerShare);
			
		
			//Compute profit
			System.out.println("What is the current price per share? ");
			double currentPrice = console.nextDouble();
			
			double profit = currentStock.getProfit(currentPrice);
			System.out.println("Net profit or lost: " )
			
			
			}
			
		}
		
		
	}

}
