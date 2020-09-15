package BankingApplication;

import java.util.ArrayList;

public class Customer {

	private String customerName;
	private ArrayList<Double> transactions;

	// constructor 
	public Customer(String customerName,  double initialAmount) {
		this.customerName = customerName;
		this.transactions = new ArrayList<Double>();
		addTransactions(initialAmount);
	}
	
	// small method to add the transaction amount to the ArrayList
	public void addTransactions (double amount) {
		 this.transactions.add(amount);
 	}

	
	// Getters and Setters:
	public String getCustomerName() {
		return customerName;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}

	
	
	
}
