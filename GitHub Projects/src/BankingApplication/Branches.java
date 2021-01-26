package BankingApplication;

import java.util.ArrayList;

public class Branches {

	
	// able to add a new customer and initial transaction amount.
	// also needs to add additional transactions for that customer/branch
	
	private String branchName;
	private ArrayList<Customer> customersList;

	// Constructor  
	public Branches(String branchName) {
		this.branchName = branchName;
		this.customersList = new ArrayList<Customer>();
	}

	public String getBranchName() {
		return branchName;
	}

	public ArrayList<Customer> getCustomersList() {
		return customersList;
	}

	
	public boolean addNewCustomer (String customerName, double initialAmount) {
			if (findCustomer(customerName) == null) {
				customersList.add(new Customer(customerName, initialAmount));
				return true;
			} else {
				return false;
			}	
		}
	
	public boolean addCustomerTransaction (String customerName, double amount) {
		Customer existingCustomer = findCustomer(customerName);
		if (existingCustomer != null) { // means customer exist
			existingCustomer.addTransactions(amount);
			return true;
		} else {
			return false;
		}	
	}
	
	
	private Customer findCustomer(String customerName) {
		for (int i = 0; i < customersList.size(); i++) {
			Customer checkedCustomer = customersList.get(i);
			if (checkedCustomer.getCustomerName().equals(customerName)) {
				return checkedCustomer;
			}
		}
		return null;
	}
}
