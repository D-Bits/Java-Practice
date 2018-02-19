
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	getArea(3, 4);
	double area = getArea(3, 4);
	System.out.println("The area is: " + area);

	}

	
	//Create function to calculate area of a rectangle
	public static double getArea(double width, double height) {
		double area = width * height;
		return area;
	}

}
