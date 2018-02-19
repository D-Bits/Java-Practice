import java.util.Scanner;

public class datinglogicpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Get user input
		Scanner console = new Scanner(System.in);
		System.out.println("Age?: ");
		int age = console.nextInt();
		
		System.out.println("Height?: ");
		int height = console.nextInt();
		
		System.out.println("Salary?: ");
		double salary = console.nextDouble();
		
		boolean dateTonight = isDate(age, height, salary);
		System.out.println(dateTonight);
		
		console.close(); //Close the input scanner
	}
	
	public static boolean isDate(int age, int height, double salary){
		
		boolean rich = salary >= 100000.00;
		boolean goodAge = age >= 21 && age < 50;
		boolean goodHeight = height >= 50 && height < 84;
		
		if((goodAge && goodHeight) || rich) {
			System.out.println("Let's get freaky tonight!");
			return true; //Its time to fuck!
		} else {
			System.out.println("You're definitely not getting any tonight....");
			return false; //Someone's not getting lucky tonight....
		}
	}

}
