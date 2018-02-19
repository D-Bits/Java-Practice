import java.io.File;

//Report info about a file

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create file object
		File f = new File("hamlet.txt");
		System.out.println("Exists return: " +f.exists());
		System.out.println("Can read returns: " + f.canRead());
		System.out.println("Length returns: " + f.length());
		System.out.println("Get absolute path: " + f.getAbsolutePath());
	}

}
