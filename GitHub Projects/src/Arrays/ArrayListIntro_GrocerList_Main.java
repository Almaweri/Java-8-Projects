package Arrays;

import java.util.Scanner;

public class ArrayListIntro_GrocerList_Main {

	private static Scanner scanner = new Scanner(System.in);
	private static ArrayListIntro_GrocerList grocetyList = new ArrayListIntro_GrocerList();

	public static void main (String [] args) {
		
		boolean quit = false;
		int choice = 0;
		boolean intOrString = true;
		printInstructions();
		while (!quit) {
			System.out.println("Enter your choice: ");
			if(intOrString) {
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				grocetyList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				quit = true;
				break;
			}
		} else {
			System.out.println(" Enter a number" );
			choice = scanner.nextInt();
			scanner.nextLine();
	} 
		
	}
		
	}
	
	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - to print the list of grocery itrem.");
		System.out.println("\t 2- to add an item to the list.");
		System.out.println("\t 3- to modify an item in the list.");
		System.out.println("\t 4- to remove an item from teh list.");
		System.out.println("\t 5- to search for an item in the list");
		System.out.println("\t 6- to quit the application.");

	}
	
	public static void addItem() {
		System.out.print(" Please enter the grocery item: ");

		grocetyList.addGroceryItems(scanner.nextLine());
	}
		
	public static void modifyItem() {
		System.out.print("Enter item number:");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter replaceent item: ");
		String newItem = scanner.nextLine();
		grocetyList.modifyGroceryList(itemNo - 1, newItem);
	}
	
	public static void removeItem () {
		System.out.print("Enter item number: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		grocetyList.removeGroceryItem(itemNo);
	}
	
	public static void searchForItem() {
		System.out.print("Item to search for: ");
		String searchItem = scanner.nextLine();
		if(grocetyList.findItem(searchItem) != null) {
			System.out.println("Found " + searchItem + " in our grocery list");
		} else {
			System.out.println(searchItem + " is not in the shopping list");
		}
	}
	

	 
	 
	
}
