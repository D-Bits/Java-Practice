
public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare variables
		double height;
		double weight;
		double bmi;
		
		//Compute BMI 
		height = 70;
		weight = 395;
		bmi = weight / (height * height) * 703;
		
		//Print the calculation
		System.out.println("Your Current BMI is: ");
		System.out.println(bmi);
		
		//Recompute (target) BMI w/ new variables
		weight = 180;
		bmi = weight / (height * height) * 703;
		
		//Report new results
		System.out.println("Target BMI is: ");
		System.out.println(bmi);
	}

}
