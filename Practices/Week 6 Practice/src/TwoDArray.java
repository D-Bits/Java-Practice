import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] temps = new double[3][5]; //no. of rows first, no. of column second
		
		//Assign values to the indices of the array
		temps[2][0] = 98.4;
		temps[1][2] = 90.3;
		temps[2][3] = 81.6;
		
		for(int i = 0; i < temps.length; i++){ //row
			for(int j = 0; j < temps[i].length; j++){
				System.out.print(temps[i][j] + " ");	
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(temps));
	}

}
