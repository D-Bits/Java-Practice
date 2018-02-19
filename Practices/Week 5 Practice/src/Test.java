
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "Java World";
		System.out.println(firstWord("    Java World"));
	}

	public static String firstWord(String s){
		int start = 0;
		//Bypass the leading space, if any 
		while(start < s.length() && s.charAt(start)== ' '){
			System.out.println("Value of start: " + start);
			start ++;
		}
		
		int stop = start;
		while(stop < s.length() && s.charAt(stop)!= ' '){
			System.out.println("Value of stop: " + stop);
			stop++;
		}
		
		return s.substring(start, stop);
	}
}
