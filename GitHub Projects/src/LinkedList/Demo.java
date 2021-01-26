package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Demo {

	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		
		addInOrder(placesToVisit, "Sanaa");
		addInOrder(placesToVisit, "Aden");
		addInOrder(placesToVisit, "Yemen");
		addInOrder(placesToVisit, "Dhamar");
		addInOrder(placesToVisit, "Taiz");
		addInOrder(placesToVisit, "Ibb");
		printList(placesToVisit);
		
		addInOrder(placesToVisit, "Albaidha");
		addInOrder(placesToVisit, "Hudaiada");
		addInOrder(placesToVisit, "Sanaa");
		printList(placesToVisit);
		visit(placesToVisit);
	}
	
	private static void printList(LinkedList<String> linkedListDemo) {
		Iterator<String> iterator = linkedListDemo.iterator(); // same as the for loop
		while (iterator.hasNext()) {
			System.out.println( " - Now visiting " + iterator.next());
		}
		System.out.println("---------------");
		
	}

	// adding new cities in alphabetical order 
	private static boolean addInOrder (LinkedList<String> linkedList, String newCity) {
		ListIterator<String> stringListIterator  = linkedList.listIterator();
		
		while (stringListIterator.hasNext()) {
		int comparison = stringListIterator.next().compareTo(newCity); // .next() is taking you to the first record
		
		if (comparison == 0) { // Equal, do not add
			System.out.println(newCity + " city is already in file");
			return false;
		} else if (comparison > 0) {// city should be added
			stringListIterator.previous(); // because the iterator will comapare and go to the next one, so we need to go back and add the city first
			stringListIterator.add(newCity);
			return true;
		} else if (comparison < 0) {
			
		}
		}
		stringListIterator.add(newCity);
		return true;
	}
	
	private static void visit(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<String> listIterator = cities.listIterator();
		
		if (cities.isEmpty()) {
			System.out.println("No cities in the itenerary");
			return;
			} else {
				System.out.println("Now visiting " + listIterator.next());
				printMenu();
			}
		
		while(!quit) {
			int action = scanner.nextInt();
			switch(action) {
			case 0:
				System.out.println("Vacation over");
				quit = true;
				break;
				
			case 1:
				if(!goingForward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					goingForward = true;
				}
				if (listIterator.hasNext()) {
					System.out.println("Now visiting " + listIterator.next());
					
				} else {
					System.out.println("Reached the end of the list");
					goingForward = false;
				}
				break;
			case 2:
				if(goingForward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					goingForward = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now visiting " + listIterator.previous());
					
				} else {
					System.out.println(" We are at the start of the list");
					goingForward = true;
				}
				break;
			case 3:
				printMenu();
				break;
			}
		}
	}
	
	private static void printMenu() {
		System.out.println("Availavle action:\npress ");
		System.out.println(" 0 - to quit\n " +
				"1- go to next city\n" +
				"2- go to previous city " +
				"3 - print menu options ");
	}
}


