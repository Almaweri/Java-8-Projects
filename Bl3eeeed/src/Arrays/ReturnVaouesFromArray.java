package Arrays;

import java.util.Scanner;

public class ReturnVaouesFromArray {

	private static Scanner sanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] myIntergers = getIntegers(5); // You defined an array and its values will come from the other method 
		for (int i = 0; i < myIntergers.length; i++) {
			System.out.println("Element[ " + i + " ] typed value was " + myIntergers[i]);
		}
		
		System.out.println("The avarage is " + getAverage(myIntergers));
		
	}
	
	public static int[] getIntegers (int number) {
		System.out.println("Enter " + number + " Interger Values.\r"); // ask the user to input the values
		
		int[] values = new int [number]; // to store the numbers in a new array called values
		
		for (int i = 0; i < values.length; i++) {
			values[i] = sanner.nextInt(); // will accept an int from the console which will be stored in an array = values[i]
		}
		
		return values;
	}
	
	public static double getAverage(int[] array) {
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum  = sum + array[i];
			// 188 / 5 = 37.8
			// the sum of the numbers (sum) / the number of number = 5 as defined up
		}
		
		return (double) sum / (double)array.length;
	}
	
}