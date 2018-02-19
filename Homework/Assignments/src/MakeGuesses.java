/*
*A program to guess the correct number(s)
*Using a pseudo-random number generator and a while loop
*Java SE 8.1
*By Dana Lockwood (2/5/17)
*/

import java.util.Random;

public class Assignment5 {
	
	public static void main(String[] args){
	
		MakeGuesses();	
	}
	
	public static void MakeGuesses(){
		
		//Reference the random class
		Random rand = new Random();
		
		int numGuesses = 0; //Value of the guess
		
		int totalGuesses = 0; //Total no. of guesses made
		
		//Loop programs guesses until it guesses a number =>48
		// use a "do while" loop
		
		do {
		
			numGuesses = rand.nextInt(50) + 1; //Use a PRNG to generate a value
				
			System.out.println("Guess: " + numGuesses); //Print the value of each guess
			
			totalGuesses++;
			
		} while(numGuesses < 48); // While the guess is less than 48
	
		System.out.println("You made " + totalGuesses + " guesses."); //Print the no. of guesses made	
		
	}
}