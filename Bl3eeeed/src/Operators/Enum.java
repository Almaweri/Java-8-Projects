package Operators;

public class Enum {

	public static void main(String[] args) {
		
	Days today = Days.SUNDAY;
	String response = "";
	String theDay = Days.FRIDAY.name();
	Days theUserDay = Days.valueOf("TUESDAY");
	System.out.println("The day is: "+ theDay);
	System.out.println("The UserDay is: "+ theUserDay);
	switch (today) {
	case MONDAY:
		response = "Get to work!";
		break;
	case FRIDAY:
		response = "Time to relax!";
		break;
	default:
		response = "Practice Java!";

	}
	System.out.println("Responce is: " + response);
	}	
}
