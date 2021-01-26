package Arrays;

import java.util.Scanner;

public class MinimumElementChallenge {

	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] readingValues = readIntergers(5);
	for (int i = 0; i < readingValues.length; i++) {
		System.out.println("Element " + i + " values is " + readingValues[i]);
		
		int minimumValue = findMin(readingValues);
		System.out.println("min is " + minimumValue);
	}
	}
	
	public static int[] readIntergers(int count) {
		System.out.println("Enter " + count + " Intergers.\r");
		
		int[] values = new int[count];

		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();

		}
		
		return values;
	}
	
	public static int findMin (int[] inputArray) {
		int minValue = inputArray[0];
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] < minValue) {
				minValue = inputArray[i];
			}
	}
		return minValue;
	} }
