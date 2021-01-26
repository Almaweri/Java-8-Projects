package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro_GrocerList {
	
	private ArrayList<String> groceryList = new ArrayList<String>();
	
	// add item
	public void addGroceryItems(String item) {
		groceryList.add(item);
	}

	// print item
	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i+1) + ". " + groceryList.get(i));
		}
	}
	
	// modify an item
	public void modifyGroceryList(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position+1) + " has been modified");
	}
	
	// delete an item
	public void removeGroceryItem (int position) {
		String theItem = groceryList.get(position);
		groceryList.remove(position);
		
	}
	
	// finding an item
	public String findItem (String searchItem) {
		//boolean exists = groceryList.contains(searchItem);
		
		int position  = groceryList.indexOf(searchItem);
		if (position >= 0) {
			return groceryList.get(position);
		}
		return null;
	}
	
	 public void validatePositiveNumber() {
	   Scanner scanner = new Scanner(System.in);

	        int number;
	        do {
	            System.out.print("Please enter a positive number: ");
	            while (!scanner.hasNextInt()) {
	                String input = scanner.next();
	                System.out.printf("\"%s\" is not a valid number.\n", input);
	            }
	            number = scanner.nextInt();
	        } while (number < 0);

	        System.out.printf("You have entered a positive number %d.\n", number);
	    }
}
