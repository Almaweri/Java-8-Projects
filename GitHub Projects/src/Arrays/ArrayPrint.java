package Arrays;

import java.util.Arrays;

public class ArrayPrint {

	public static void main(String[] args) {
		
		int [] myIntArray = new int [5];
		int [] anotherArray = myIntArray;

		System.out.println("myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("anotherArray = " + Arrays.toString(anotherArray));

		anotherArray [0] = 45;
		
		// both Arrays got the same value as they point to the same index in memory.

		System.out.println("aftre change myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

		// here we are creating a new index for the anotherArray which is different than the myIntArray
		anotherArray = new int [] {5,10,15,20,25,30};
		
		modufyArray(myIntArray);

		
		System.out.println("aftre modify myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));

		newArray(anotherArray);
		System.out.println("after mmmm anotherArray = " + Arrays.toString(anotherArray));


	}
	
	private static void modufyArray (int [] array) {
		
		array[0] = 2;
		array = new int [] {1,2,3,4,5};
	}
	
	private static int newArray (int [] mod) {
		mod [0] = 555;
	int [] mod2 = new int []{45, 34, 434, 43, 54};
	System.err.println("Mod is = " + Arrays.toString(mod2));
	return 0;
		
		
	}
}
