import java.util.Scanner;


public class stringpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("What's your name, asswipe?");
		String name = console.next();
		
		if(name.equals("Barney")){
			System.out.println("Hi, dumbass!");
		} else {
			System.out.println("Hi, Stranger!");
		}
		
		if (name.startsWith("Prof")){
			System.out.println("What your office hours?");
		}
	}
	

}
