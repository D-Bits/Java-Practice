import java.util.Scanner;

//Prompt user for loan info and compute monthly loan payment


public class Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Use Scanner object
		Scanner console = new Scanner(System.in);
		
		//Obtain values 
		System.out.println("The program processes loan payments.");
		System.out.print("Loan amount: ");
		double loan = console.nextDouble();
		System.out.print("Number of Years: ");
		int years = console.nextInt();
		System.out.print("Interest Rate: ");
		//Prompt the user for input
		double rate = console.nextDouble();
		System.out.println();
		
		//Close Scanner resource
		console.close();
		
		//Compute result
		int n = 12 * years;
		double c = rate / 12.0 / 100.0;
		double payment = loan * c * Math.pow(1+c, n) / // Reutrns the value of the 1st argument, raised to the 2nd arguament
				(Math.pow(1+c, n) -1);
		
		//Display report
		System.out.print("Montly payment due is: $" + (int) payment);
	}
	


}
