import java.util.Arrays;

public class MoveArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = {3, 8, 9, 7, 8};
		
		//Store the first value in a temp variable
		int first = list[0];
		
		for(int i= 0; i < list.length -1; i++){
			//Assigning each next value in the previous element index
			list[i] = list[i+1]; 
		}
		
		//Assign first to list
		list[list.length -1] = first;

		System.out.println(Arrays.toString(list));
	}

}
