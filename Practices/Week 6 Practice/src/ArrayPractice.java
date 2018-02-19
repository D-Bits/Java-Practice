import java.util.Arrays;


public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 7, 5 , 6, 4, 14, 11};
		
		for(int i = 0; i < a.length -1; i++){
			if(a[i] > a[i+1]){
				a[i+1] = a[i+1] *2;
			}
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
