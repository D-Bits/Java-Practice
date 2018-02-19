/*
 * A Java program to display the first 12 numbers in the Fibonacci sequence 
 * Using JavaSE-1.8
 * By Dana Lockwood (1/17/18)
 * */

public class Fibonacci12 {

	public static void main(String[] args) {
		
		/*Define variables for first two Fibonacci numbers, 
		 *the number of numbers to print,
		 *and the upper limit
		 **/
		int fib1 = 0; int fib2 = 1, fib3, i, limit = 13;
		
		//Create for-loop, starting with 1
		for (i=1; i < limit; ++i) {
			fib3 = fib2 + fib1;
			fib1 = fib2;
			fib2 = fib3;
			System.out.println(fib3);
		}
	}

}
