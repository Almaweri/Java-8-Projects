package Arrays;

public class Arraysss {
	public static void main(String[] args) {
		

//	int[] myIntArray =  {12,34,45,56,66,65,65,65};
//	System.out.println(myIntArray[2]);
	
		int[] myIntArray = new int[10];
		
		
	for (int i = 0; i < myIntArray.length; i++) {
			myIntArray[i] = i*10;
		}
		printArray(myIntArray);
	
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " value is " + array[i]);
	}
	}
}