package com.hpt.order.system;

public class Switch {

	public static void main(String[] args) {
		studentsGrades();
	}
	
	private static char studentsGrades () {
		char stdGrade = 'A';
		
		switch (stdGrade) {
		case 'A' :
			System.out.println("Greate Job");
			break;
		case 'B' :
			System.err.println("Good job");
			break;
			default:
				System.out.println("Study more");
		} 
		
		
		
		return stdGrade;
		
	}
	
}
