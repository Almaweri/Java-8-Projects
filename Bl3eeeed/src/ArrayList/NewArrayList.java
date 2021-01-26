package ArrayList;

import java.util.ArrayList;

public class NewArrayList {

	private ArrayList<String> groceryList = new ArrayList<String>();
	
	public void addGroceryItem (String item) {
		groceryList.add(item);
		System.out.println("Item is ==> " + item);
	}
	
	public void printGrocery () {
		System.out.println("You have" + groceryList.size() + " items in your grocery list.");
		for (String littleItem : groceryList) {
			System.out.println("Little is " + littleItem);
		}
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println(i+1 + ". " + groceryList.get(i));
		}
	
		
	}
		
	public void modifyGroceryItem (int position, String newItem) {
		
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + position+1  + " has been modified.");
		
	}
	
	public void removeGroceryitem (int position) {
		String itemRemoved = groceryList.get(position);
		groceryList.remove(itemRemoved);
		System.out.println("Item number " + position + " has been removed");
	}
	
	public String findItem(String searchItem) {
		//boolean exists = groceryList.contains(searchItem);
		
		int position = groceryList.indexOf(searchItem);
		if (position >= 0) {
			return groceryList.get(position);
		}	else {
				return null;
				
			}
					
		
		
	}
}
