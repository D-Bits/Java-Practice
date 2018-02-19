
public class Point {

	//Input fields
	private int x;
	private int y; // "Private" is an access modifier 
	
	//Constructor
	public Point(int initialX, int initialY){
		
		x = initialX;
		y = initialY;
	}
	
	//Other methods
	public double distanceFromOrigin(){
		return Math.sqrt(x * x + y * y);		
	}
	
	public void translate(int dx, int dy){
		x += dx;
		y += dy;
	}
	
	//Generate getters and setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

	public String toString(){
		return ("The value of x is: " + x + " " + "The value of y is: " + y);
	}
	
}
