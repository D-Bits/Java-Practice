/*
 * Simulate rolling 2 dice
 * Until a double comes up
 * Using random number gens 
 * */
import java.util.Scanner;
import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		//Create an instance of the Random class
		Random r = new Random();
		
		//Declare vars
		int roll1, roll2;
		int count = 0;
		
		do { //Do the loop at least once
			//add statements
			roll1 = r.nextInt(6)+1;
			roll2 = r.nextInt(6)+1;
			System.out.println("nextroll = " + roll1 + ", " + roll2);
			count++;
			
		} while(roll1 != roll2);
		
		System.out.println("Doubles after " + count + " rolls");
	}

}
