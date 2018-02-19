/*
 * Create a program to determine if a parrot is dead or alive
 * By Dana Lockwood
 * Using Java 8.1 SE
 */

import java.util.Scanner;

public class ParrotProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Get input from user
		Scanner console = new Scanner(System.in);
		
		String aliveordead = console.toString();
		
		System.out.println("Is the parrot dead or alive?: ");
		
		//Begin conditional
		if(aliveordead == "alive"){
			System.out.println("Its not dead! Its just sleeping!");
		} else aliveordead == "dead"{
			System.out.println("This parrot is no more! It has ceased to be!");
		}
	}

}
