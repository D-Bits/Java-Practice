import java.util.*;

public class BMIPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter next person's information: ");
		System.out.println("Height (in.): ");
		double height1 = console.nextDouble();
		System.out.println("Weight (lbs.): ");
		double weight1 = console.nextDouble();
		double bmi1 = weight1 / (height1 * height1) * 703;
		System.out.println();
		console.close();
		
		System.out.println("Person #1's BMI is: " + bmi1);
		
		if (bmi1 < 18.5){
			System.out.println("Underweight. Someone needs to put on a few pounds...");
		} else if (bmi1 <25) {
			System.out.println("Normal. Goode for you!");
		} else if (bmi1 < 30) {
			System.out.println("Overweight. Damn, you've let yourself go, haven't you?");
		} else if (bmi1 >= 30) {
			System.out.println("Obese. Time to hit the gym, fatass!");
		}
		
	}

}
