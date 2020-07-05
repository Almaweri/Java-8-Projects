package ArrayList;

import java.util.ArrayList;

public class ArrayLists {

	
	private ArrayList<String> groceryList= new ArrayList<String>();
	
	public static void main(String[] args) {
	//	addGroceryItem(item);
	}
	
	public void addGroceryItem (String item) {
		groceryList.add(item); // Adding an item(s) to the list
	}
	
	public void printGrocrylist() {
		System.out.println("You have " +groceryList.size() + " items in your grocery list");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i+1) + ". " + groceryList.get(i));
		}
	}
	
	public void modifyGroceryItem (int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position) + "has been modified.");
		
	}
	
	public void removeGroeryItem (int position) {
		String theItem = groceryList.get(position);
		groceryList.remove(position);
	}
}
