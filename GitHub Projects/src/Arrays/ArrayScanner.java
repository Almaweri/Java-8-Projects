package Arrays;

import java.util.Scanner;

public class ArrayScanner {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int [] myIntegers = getIntegers(5);
		for (int i = 0; i < myIntegers.length; i++) {
			System.out.println("Element " + i + ", typed values was " + myIntegers[i]);
		}
		
		System.out.println("The average is " + getAverage(myIntegers));
	}

	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number + ", integer values.\r ");
		//define your array, it accepts any number
		int[] values = new int [number];
		
		for (int i = 0; i < values.length; i++) {
			// going through the entir array 
			values[i] = scanner.nextInt();
		}
		
		return values;
	}

	// Create a method, pass the array and get it to return what the actual average of the numbers are 
	// The average is calculated by determining the sum of all the values in the array and dividing that by the actual length
	
	
	public static double getAverage (int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			
		}
		// using double here to get the double count otherwise it will return a whole number
	return (double) sum / (double) array.length;
	}
	
}
