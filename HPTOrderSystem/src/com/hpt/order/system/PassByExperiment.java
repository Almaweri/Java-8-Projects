package com.hpt.order.system;

public class PassByExperiment {
	
	public static void main(String[] args) {
		
		//In the main( ) method, first create a MyDate object.
		MyDate date = new MyDate(1,20,2008);
		//Print out the date reference before and after calling the passObject( ) method.
		System.out.println("Before passing an object " + date);
		passObject(date);
		System.out.println("After passing an object " + date);
		// Do the same work to write out the date’s year and call on the passPrimitive) method.
		System.out.println("Before passing a primitive " + date.year);
		passPrimitive(date.year);
		System.out.println("After passing a primitive " + date.year);
		// Lastly, create a String reference from toString( ) of the MyDate object.
		//Use this String object to call on the passString( ) method. Once again print out the String value before and after the call to the method.
		String x = date.toString();
		System.out.println("Before passing a String " + x);
		passString(x);
		System.out.println("After passing a String " + x);
	}
	
	public static void passObject(MyDate d) {
		d.year = 2009;
	}
	
	public static void passPrimitive (int i) {
		i = 2010;
	}
	
	public static void passString (String s) {
		int yearSlash = s.lastIndexOf('/');
		s = s.substring(0, yearSlash + 1);
		s += "2012";
		System.out.println("New date String: " + s);
	}

	public static void passStringBuiler (StringBuilder sb) {
		StringBuilder theYearSlash = sb.append('/');
	}
	
}
