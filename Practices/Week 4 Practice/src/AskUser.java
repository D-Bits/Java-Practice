import java.util.Scanner;


public class AskUser {

	public static void main(String[] args) {
		// Demonstrate use of a sentinel
		Scanner console = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		System.out.print("Next integer(-1 to quit)? ");
		int number = console.nextInt();
		
		while(number != -1){
			sum +=number;
			System.out.print("The next integer (-1 to quit)? ");
			number = console.nextInt(); 
		}
		
		System.out.println("Sum = " + sum);
	}

}
