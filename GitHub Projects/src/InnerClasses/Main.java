package InnerClasses;

import java.util.Scanner;

import InnerClasses.Button.OnClickLister;
import InnerClasses.Gearbox.Gear;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button("Button Print");
	
	public static void main(String[] args) {
		
		/*
		 * class ClickListner implements Button.OnClickLister { // Button is the class
		 * and OnlickListner is the interface in the same class.
		 * 
		 * public ClickListner( ) { System.out.println("I've been attached"); }
		 * 
		 * @Override public void onClick(String title) { System.out.println(title +
		 * " was clicked");
		 * 
		 * } }
		 * 
		 * btnPrint.setOnClickListner(new ClickListner());
		 */
		
		
		btnPrint.setOnClickListner(new OnClickLister() {
	
			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked");
				
			}
		});
		
		
		
		listen();
	}
		
	private static void listen() {
		boolean quit = false;
		while (!quit) {
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 0:
				quit = true;
				break;
			case 1: 
				btnPrint.onClick();
			}
		}
	}	
}
