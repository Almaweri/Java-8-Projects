package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MinimumelementChallenge {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	System.out.println("Enter count: ");
		int [] returnedArray = readIntegers(5);
		System.out.println("You Entered the Integers = " + Arrays.toString(returnedArray));

		// testing the 1st way of finding the min
		int min = findMin(returnedArray);
		System.out.println("min issss  " + min);
		
		// testing the 1st way of finding the min
		int returnedMin = findMini(returnedArray);
		System.out.println("Returned Min is =  " + returnedMin);
		
	}
	
	private static int [] readIntegers (int count) {

		// define an array that accepts the parameter to count the integers.
		int [] array = new int [count];
		// looping throw the Array.
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter "+ count + " integers. \r");

			// Now we are feeding the array from the scanner.
			array[i] =  scanner.nextInt();
		}
		// and then return the Array
		return array;
	}
	
	// first way to find the min number.
	private static int findMin(int [] array) {
		int minValue = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minValue) {
			minValue = array[i];	
				
			}
					}
		
		return minValue;
		
		
	}
	
	// Another way of finding the min number. 
	private static int findMini (int [] array) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			//Retrieve the value of the element at position i
			int value = array[0];
			if (value < min) {
				min = value;
				
			}

		}

		return min;
		
	}
	
}

