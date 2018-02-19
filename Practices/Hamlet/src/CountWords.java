import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Exception handling practice
public class CountWords {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		System.out.println("What is the file name? ");
		String name = console.nextLine();
		try(
			Scanner input = new Scanner(new(File(name));
			)catch(FileNotFoundException f){
				System.out.println("File not found");
			})
		
		Scanner input = new Scanner(new File(name));
		int count = 0;
		
		while(input.hasNext()){
			String word = input.next();
			count++;
		}
		
		System.out.println("The total number of words: " + count);
		
		input.close();
		
	}

}
