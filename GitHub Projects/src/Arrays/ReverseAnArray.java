package Arrays;

import java.util.Arrays;

public class ReverseAnArray {
	
	public static void main(String[] args) {
		int [] array = {1,5,3,7,11, 9, 15};
		System.out.println("Array before = " + Arrays.toString(array));
		reverse(array);

        System.out.println("Array After =  " + Arrays.toString(array));		
		
	}
	
	private static void reverse(int[] array) {
		
		int maxIndex = array.length - 1; // To Access the LAST element.
		int halfLength = array.length / 2;
		for (int i = 0; i < halfLength; i++) {
			int temp = array[i];
			array[i] = array[maxIndex - 1];
			array[maxIndex - 1] = temp; 
		}
		for (int i = 0; i < halfLength; i++) {
			int numSorted = array[i]; // getting the first inext in the array

		}
		
	}

}
