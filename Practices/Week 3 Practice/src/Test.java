import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program adds a sequence of");
		System.out.println("Numbers.");
		System.out.println();
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("How many numbers do you have?");
		int totalNumber = console.nextInt();
		
		double sum = 0.0;
		for (int i = 1; i <= totalNumber; i++){
			System.out.print("   #" + i + "? ");
			double next = console.nextDouble();
			// Accumulation pattern
			sum += next; //sum = sum + next
		}
		System.out.println();
		
		System.out.println("sum = " + sum);
	} 

}
