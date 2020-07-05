package String;

import java.util.Calendar;
import java.util.Locale;

public class ImmutableStringsCont {

	
	public static void main(String[] args) {
		
		// Example using immutable String and concatenation
		String message = "Hello, ";
		String name = null;
		message += name;
		message += ".  Today is ";
		message += Calendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);	
		message += ".";
		System.err.println(message);
		// Example using StringBuilder
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello, ");
		sb.append(name);
		sb.append(". Today is ");
		sb.append(Calendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US));
		sb.append(".");
		System.out.println(sb);
	}
	
	// Results:
	//Hello, null.  Today is Sunday.
	//Hello, null. Today is Sunday.
}
