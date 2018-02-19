import java.util.Arrays;


public class IncrementOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list1 = buildOddArray(5);
		
		//reverse(list1);
		//System.out.println(Arrays.toString(list));
		incrementAll(list1);
		
		//System.out.println(Arrays.toString(list));
		
		//For each Loop
		for(int l : list1){
			System.out.println(l + " "); //For each instance of "l" in the variable "list", print this statement
		}
		
		int count = count(list1, 2);
		System.out.println("Count: " + count);
		
		replaceAll(list1, 8, 42);
		System.out.println(Arrays.toString(list1));
		
		int[] list2 = buildOddArray(5);
		incrementAll(list2);
		
		//Call the reverse function
		String result = reverse("Taco Cat");
		
		System.out.println(result);
		
		//int[] list1 = buildOddArray(6);
		
		/*boolean result = equals(list1, list2){
			System.out.println(result);
		}*/
	}
	
	//Reverse a string
	public static String reverse(String text){
		
		String result = "";
		for(int i = 0; i < text.length(); i++){
			result = text.charAt(i) + result;
		}
		return result;
	}
	
	/*public static void reverse(int[] list){
		for(int i = 0; i < list.length; i++){
			int j = list.length - 1;
			swap(list, i, j);
		}
	}*/
	
	public static void swap(int[] list, int i, int j){
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	
	public static boolean equals(int[] list, int[] list2){
		//Check the length
		if(list.length !=  list2.length)
			return false;
		
		for(int i = 0; i < list.length; i++){
			if(list[i] != list2[i])
				return false;
		}
		return true;
	}
	
	public static void replaceAll(int[] list, int target, int replacement){
		for(int i = 0; i < list.length; i++){
			if(list[i] == target)
				list[i] = replacement;
		}
	}
	
	//Count # of occurrences of target
	public static int count(int[] list, int target){
		int count = 0;
		
		//Start for each loop
		for(int n : list){
			if(n == target){
				count++;
			}
		}
		return count;
	}
	
	public static int indexOf(int[] list, int target){
		for(int i = 0; i < list.length; i++){
			//Check if element matches the target
			if(list[i] == target)
				return i;
		}
		
		return -1; //no. of index found
	}

	//Return an array of given size (5) of consecutive odd numbers
	public static int[] buildOddArray(int size){
		int[] data = new int[size]; //0 values
		for(int i = 0; i < data.length; i++){
			data[i] = 2 * i + 1;
		}
		
		return data;
		
	}
	
	public static void incrementAll(int[] data){
		for(int i = 0; i < data.length; i++){
			data[i]++;
		}
	}
}
