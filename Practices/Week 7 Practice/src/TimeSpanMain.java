

public class TimeSpanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an instance of the Timespan object
		TimeSpan t1 = new TimeSpan(1, 25); //1 hr, 25 min
		TimeSpan t2 = new TimeSpan(2,15); //2 hrs, 15 min
		
		System.out.println(t1);
		System.out.println(t2);
		
		Point p = new Point(2,3);
		boolean res = t1.equals(t2);
		System.out.println(res);
		
	}

}
