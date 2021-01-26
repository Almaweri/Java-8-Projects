package com.hpt.order.system;

public class vaildAndNotValid {

	public static void main(String[] args) {
		
	}
	
	private  boolean valid(int day, int month, int year) {
		boolean isValid = true;
		
		if(day > 31 || day < 1 || month > 12 || month < 1) {
			isValid = false;
		} else {
			switch (month) {
				case 4: case 6: case 9: case 11:
					isValid = (day <= 30);
					break;
				case 2:
					isValid = (day <= 28 || (day == 29 && year % 4 == 0));
					System.out.println(isValid);
		}
		}
		return isValid;
	}
	
	/*
	 * public void tomorrow(int day) { if(valid(day +1 , 11, 2020)) { day ++;
	 * 
	 * } else if (valid(1, month + 1, year)) { day = 1; month ++;
	 * 
	 * } else { day = 1; month = 1; year ++; } }
	 */
	
}
