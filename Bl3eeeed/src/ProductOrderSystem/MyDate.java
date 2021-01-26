package ProductOrderSystem;

public class MyDate {

	int day;
	int year;
	int month;
	
	public MyDate( ) {
		
	}
	
	// constructor with parameters [Arguments] to enable the user to create a MyDate using a constructor like this: new MyDate(2, 6, 2004)
	public MyDate(int m, int d, int y) {
		setDate(m, d, y);
		
	}
	
	public String myString() {
		return year + "/" + year + "/" + year;
	}
	
	public String toString() {
		return  month + "/" + day + "/" + year;
	}
	
	public void setDate(int m, int d, int y) {
		day = d;
		year = y;
		month = m;
	}
	
}
