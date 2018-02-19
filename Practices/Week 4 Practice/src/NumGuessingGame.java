import java.util.Scanner;
import java.util.Random;

public class NumGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 42;
		Scanner console = new Scanner(System.in);
		
		System.out.print("You guess? ");
		int guess = console.nextInt();
		int numGuesses = 1;
		
		while(guess != number){
			System.out.println("Incorrect");
			if(guess > number)
				System.out.println("Too high!");
			else if(guess < number)
				System.out.print("Too low!");
			System.out.print("Your guess? ");
			guess = console.nextInt();
			numGuesses++;
		}
		
		System.out.println("You got this right in " + numGuesses + " tries. Not bad for a dumbass...");
	}

}
