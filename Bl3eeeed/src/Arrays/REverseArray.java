package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class REverseArray {

	public static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		int[] array = {1, 4, 5, 6, 2, 7, 23, 65, 65};
		System.out.println("Array = " + Arrays.toString(array));
		
		reverseArray(array);
		
		System.out.println("Reversed array = " + Arrays.toString(array));
		
		
		
	}
	
	public static void  reverseArray(int[] array) {
		
			int maxIndex = array.length - 1;
			int halfLength = array.length / 2;
		for (int i = 0; i < halfLength; i++) {

			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
		}
		
	}
	
}
