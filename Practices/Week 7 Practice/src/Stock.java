
public class Stock {
	
	//Instances vars
	private String symbol; //stock symbol
	
	private int totalShares; //total shares purchased 
	
	private double totalCost; //Cost for all shares
	
	//Constructor
	public Stock (String theSymbol){
		if(theSymbol == null)
			throw new NullPointerException();
		symbol = theSymbol;
		totalShares = 0;
		totalCost = 0.0;
	}
	
	//Return total profit or loss based on the price per share
	public double getProfit(double currentPrice){
		if (currentPrice < 0.0)
			throw new IllegalArgumentException();
		
		double marketValue = totalShares * currentPrice; //the current market value
		return marketValue - totalCost;
	} 
	
	//make a purchase of a given share a given price
	public void purchase(int shares, double pricePerShare){
		if(shares < 0 || pricePerShare < 0.0)
			throw new IllegalArgumentException(); 
	}
	
	totalShares += shares;
	totalCost += shares * pricePerShare;

}
