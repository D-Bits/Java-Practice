/*
 * Use as a template
 * for getting user input*/

import java.util.Scanner;

public class Robust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console = new Scanner(System.in);
		int age = getInt(console, "How old are you? ");
		System.out.println(age);
		int guess = getIntBetween(console, "guess", 1, 100);
		System.out.println(guess); 
	}

	public static int getIntBetween(Scanner console, String prompt, int low, int high){
		int response;
		response = getInt(console, prompt);
		while(response < low || response > high){
			System.out.println("Enter an int between " + low + " and " + high);
			response = getInt(console, prompt);
		}
		return response;
		
	}
	
	public static int getInt(Scanner console, String prompt){
		System.out.print(prompt);
		while (!console.hasNextInt()){
			console.next();
			System.out.println("That's not an int, dumbass! Try again.");
			System.out.print(prompt);
			
		}
		return console.nextInt();
	}
}
