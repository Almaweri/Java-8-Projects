package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int[] newValues = getInt(5);
		int[] sortedValues = sortArray(newValues);
		printArray(sortedValues);
		
		System.err.println("----------------");
		for (int i = 0; i < newValues.length; i++) {
			System.out.println("Element " + i + " value was typed is " + newValues[i]);
		}
		
	

	}
	
	
	public static int[] getInt (int number) {
	System.out.println("Enter "  + number + " Entgers\r");
	
	int[] values  = new int[number];
	
	for (int i = 0; i < values.length; i++) {
		values[i] = scanner.nextInt();
	}
		return values;

	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + "  contents  " + array[i]);
		}
	}
	
	
	public static int[] sortArray (int[] array) {
		/*int[] sortedArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
		sortedArray[i] = array[i]; 
		}*/
		// this line replace the three lines above
		int[] sortedArray = Arrays.copyOf(array, array.length);
		
		boolean flag = true;
		int temp;
		
		while (flag) {
			flag = false;
			
			for (int i = 0; i < sortedArray.length -1; i++) {
				if(sortedArray[i] < sortedArray[i+1]) { // if sortedArray in index 0 ==> 60 is less than sortedArray in index 1 ==> 120
					temp = sortedArray[i]; // saved the swiped element in a temp to compare it with the next one and keep swiping
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag =true; // go back and check again until it becomes false
				}
			}
			 
		}
		
		
		
		return sortedArray;
		
		
	}
}
