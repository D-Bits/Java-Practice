
import java.util.*;   // for Scanner // for Math


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner console = new Scanner(System.in);

        // obtain values
        System.out.println("This program computes powers of " +
                           "BASE_X  to POWER_Y . ");
        System.out.println("This program will show all powers calculations  " +
                "(BASE_X  to 0th-power), ... , to (BASE_X to POWER_Y th-power) . ");
        System.out.print(" Enter in BASE_X number     : ");
        double base_x = console.nextDouble();
        System.out.println();
        System.out.print(" Enter in POWER_Y number    : ");
        double power_y = console.nextDouble();
        System.out.println();
        
        // CLOSE OUT CONSOLE
        console.close();

        double result = printPowersOfN(base_x, power_y);
        
        System.out.println ("    ");
        System.out.println ("Final Result of BASE_X of : \t" + base_x + 
        		            "\t to POWER_Y of : \t" + power_y + "\t is : \t" + result );
        
        
	}

	public static double printPowersOfN(double base_x, double power_y){
		double result = 0.0 ;
		for (int i = 0; i <= power_y; i++) {
			result = Math.pow(base_x, i);
            System.out.print(result + " , ");
        }
		
		System.out.println ("    ");
		
		return result;
	}
	
	
}