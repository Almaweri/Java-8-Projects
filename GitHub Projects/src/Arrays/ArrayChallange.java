package Arrays;

import java.util.*;
import java.util.Scanner;

public class ArrayChallange {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] myValues = getIntegers(6);
		int[] sorted = sortArray(myValues);
		printArray(sorted);
		
		
		/*for (int i = 0; i < myValues.length; i++) {
			System.out.println("Numbers Entered are  " + myValues[i]);

		}*/
	
	}
	
	
	public static int[] getIntegers (int capacity) {
		System.out.println("Enter the Element " + capacity + "here.\r");
		
		// define your array here
		int[] arrayValue = new int [capacity];
		for (int i = 0; i < arrayValue.length; i++) {
			
			// this will ask the user to input array of numbers.
			arrayValue[i] = scanner.nextInt();
			
		}
		return arrayValue;
	}
	
	public static void printArray(int [] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + "contents " +array[i]);
		}
	}
	
	public static int[] sortArray (int[] array) {
		/*
		 * int [] sortedArray = new int[array.length]; for (int i = 0; i <
		 * sortedArray.length; i++) { sortedArray[i] = array[i]; }
		 */
		
		// this line of code does what the 3 lines of code will do 
		int [] sortedArray = Arrays.copyOf(array, array.length);
		
		
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < sortedArray.length - 1; i++) {
				if(sortedArray[i] < sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
		}
		
		return sortedArray;
		
	}
	

}
