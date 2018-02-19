/*
 * Represent a time span of elapsed hours and minutes
 */

public class TimeSpan {

	//Instance variable(s)
	private int totalMinutes;
	
	//Constructor 
	public TimeSpan(int hours, int minutes){
		totalMinutes = 0;
		add(hours, minutes);
	}
	
	//add the interval to the time span
	public void add(int hours, int minutes){
		if(hours < 0 || minutes < 0){
			throw new IllegalArgumentException();
		}
		totalMinutes += 60 * hours + minutes;
	}
	
	//Generate getters and setters
	public int getTotalMinutes() {
		return totalMinutes;
	}

	public void setTotalMinutes(int totalMinutes) {
		this.totalMinutes = totalMinutes;
	}

	public String toString(){
		return(totalMinutes / 60 + "hrs " + totalMinutes % 60 + "mins"); 
	}
	
	//Return whether o is a timespan representing the same no. of hours and minutes as this timespan object
	public boolean equals(Object o){
		if (o instanceOf TimeSpan){
			TimeSpan other = (TimeSpan) o;
			return totalMinutes == other.totalMinutes;
		} else {
			return false; //not a TimeSpan object
		}
			
	}
	
}
