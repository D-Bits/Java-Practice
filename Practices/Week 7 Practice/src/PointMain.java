

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create instances of the Point object
		Point p1 = new Point(7, 2);
		Point p2 = new Point(4, 3);
		Point p3 = new Point(3, 5);
		
		p1.setY(9);
		p1.getY();
		
		System.out.println("p1 y is: " + p1.getY());
		
		//Call distanceFromOrigin
		double d1 = p1.distanceFromOrigin();
		System.out.println("P1 distance from origin: " + d1);
		
		double d2 = p2.distanceFromOrigin();
		System.out.println("P2 distance from origin: " + d2); 
		
		double d3 = p3.distanceFromOrigin();
		System.out.println("P3 distance from origin: " + d3); 
		
		//Translate point to a new location
		p1.translate(11, 6);
		p2.translate(1, 7);
		p3.translate(7, 9);
		
		//Print the points
		System.out.println("P1 is: " + p1);
		System.out.println("P2 is: " + p2);
		System.out.println("P3 is: " + p3);
		
	}

}
