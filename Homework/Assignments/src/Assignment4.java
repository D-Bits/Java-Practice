/*
*A prgram to determine what season it currently is, based on the current day and month
*Using Java SE 8.1
*By Dana Lockwood (1/29/18)
**/

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
		
		//Prompt the user to input the current month
		System.out.println("Please enter a (whole) number from 1 to 12 for the current month: "); 
		int month = console.nextInt();
		
		//Prompt the user to input the current day
		System.out.println("Please enter a (whole) number from 1 to 31 for the current day: "); 
		int day = console.nextInt();

			//Begin control flow for different seasons
		    if((month == 12 && day >= 20 && day <= 31) || (month == 1 && day >=1 && day <= 31) || (month == 2 && day >= 1 && day <= 28 ) || (month == 2 && day >= 1 && day <= 29 ) || (month == 3 && day >=1 && day <=19))
		    {	//Conditions for Winter
		        System.out.println("Winter (and the White Walkers) is here!");
		    }
		    else if ((month == 3 && day >= 20 && day <= 31) || (month == 4 && day >=1 && day <= 30) || (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >=1 && day <=19))
		    { 	//Conditions for Spring
		        System.out.println("Its Spring");
		    }
		    else if ((month == 6 && day >= 20 && day <= 30) || (month == 7 && day >=1 && day <= 31) || (month == 8 && day >= 1 && day <= 31) || (month == 9 && day >=1 && day <=19))
		    { 	//Conditions for Summer 
		        System.out.println("Its Summer");
		    }
		    else if ((month == 9 && day >= 20 && day <= 30) || (month == 10 && day >=1 && day <= 31) || (month == 11 && day >= 1 && day <= 30) || (month == 12 && day >=1 && day <=19))
		    { 	//Conditions for Fall
		        System.out.println("Its Fall. Winter is coming....");
		    }

	}

}
