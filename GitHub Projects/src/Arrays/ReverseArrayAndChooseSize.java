package Arrays;

import java.util.Scanner;

public class ReverseArrayAndChooseSize {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int arrSize = scan.nextInt();
		// now I determined the size of the array and feed it to the new array
		int arr[] = new int [arrSize];
		
		System.out.println("Enter an array values: ");
		
		// Input array values: by asking the user to enter them and looping through them 
		for (int i = 0; i < arrSize; i++) {
			arr[i] = scan.nextInt(); // feeding the array with each element from the user
			
		}
		
		int temp;
		int start = 0;
		int end = arrSize - 1;
		 
		while(start < end) {
			temp = arr[start];
			arr[start] = arr [end];
			arr[end] = temp;
			
			start++;
			end --;
			scan.close();
		}
		
		System.out.println("Printing an Arry after reversing: ");
		
		for (int i = 0; i < arrSize; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
