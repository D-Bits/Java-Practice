//James Shively
//Stani Meridith
//ITC 115 - Object Oriented Programming (Java)

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);

		System.out.print("Input a month number: ");
	    int month = console.nextInt(); 
	    
	    System.out.print("Input a day number: ");
	    int day = console.nextInt();

	    if((month == 12 && day >= 20 && day <= 31) || (month == 1 && day >=1 && day <= 31) || (month == 2 && day >= 1 && day <= 28 ) || (month == 2 && day >= 1 && day <= 29 ) || (month == 3 && day >=1 && day <=19))
	    {
	        System.out.println("Winter is Seattle's rainiest season.");
	    }
	    else if((month == 3 && day >= 20 && day <= 31) || (month == 4 && day >=1 && day <= 30) || (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >=1 && day <=19))
	    {
	        System.out.println("Watch as flowers begin to bloom in spring.");
	    }
	    else if((month == 6 && day >= 20 && day <= 30) || (month == 7 && day >=1 && day <= 31) || (month == 8 && day >= 1 && day <= 31) || (month == 9 && day >=1 && day <=19))
	    {
	        System.out.println("Summer is perfect for hitting the beach!");
	    }
	    else if((month == 9 && day >= 20 && day <= 30) || (month == 10 && day >=1 && day <= 31) || (month == 11 && day >= 1 && day <= 30) || (month == 12 && day >=1 && day <=19))
	    {
	        System.out.println("Gaze at the beautiful nature during autumn!");
	    }
	    
	}

}
