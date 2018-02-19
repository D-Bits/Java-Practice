/*
 * A program to increment a position by one
 * Using Java SE 8.1
 * By Dana Lockwood (2/12/18)
 */

 import java.util.Random;

 public class Assignment6 {

 	public static void main(String[] args) {
 		// TODO Auto-generated method stub

 		randomWalk();

 	}

 	public static void randomWalk() {

 	    int step = 0; //set initial value for each step

 	    int max = 0; //Set initial value for max step

 	    Random rand = new Random(); //Create RNG

 	    //Create do while loop
 	    do{
 	        step += rand.nextInt(2)*2 -1; //Generate a random number of 1 or -1 using an assignment operator
 	        System.out.println("Position= " + step); //Print the values of each step
 	        if(step > max){
 	            max++; //If the step value is greater than the max, increment by 1
 	        }
 	    } while(step != 3 && step != -3);

 	    System.out.println("Max number: " + max);

 	}

 }
