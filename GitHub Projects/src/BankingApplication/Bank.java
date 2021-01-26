package BankingApplication;

import java.util.ArrayList;

public class Bank {

	// add a new branch.
	// add a new customer to that branch with initial transaction.
	// add a transaction for an existing customer fort that branch.
	// show a list of customers for a a
	
	private String bankName;
	private ArrayList<Branches> branchesList;
	private String branchName;
	
	public Bank(String bankName) {
		this.bankName = bankName;
		this.branchesList = new ArrayList<Branches>();
	}

	// add a new branch 
	public boolean addBranch (String branchName) {
		if(findBranch(branchName) == null) {
			branchesList.add(new Branches(branchName));
			return true;
		} else {
			return false;
		/*
		 * if(findBranch(branchName) == null) { System.out.println("Branch name" +
		 * branchName + "exist in the file"); return false; } else {
		 * 
		 * this.branchesList.add( new Branches(branchName);
		 * this.branchesList.add(branchName); return true;
		 */
	}
	}
	
	// add a new customer [ will need his name, and branch name, initial amount]
	 public boolean addCustomer(String branchName, String customerName, double initialAmount) {
	        Branches branch = findBranch(branchName);
	        if(branch != null) {
	            return branch.addNewCustomer(customerName, initialAmount);
	        }

	        return false;
	    }
	
	private Branches findBranch (String newBranchName) {
		for (int i = 0; i < branchesList.size(); i++) {
			Branches checkBranch = branchesList.get(i);
			if(checkBranch.getBranchName().equals(newBranchName)) { 
				return checkBranch;
			}

		}
		return null;
	}
	 
	public boolean addCustomerTransaction (String branchName, String customerName, double initialAmount) {
		Branches branch = findBranch(branchName);
		if(branch != null) {
			return branch.addCustomerTransaction(customerName, initialAmount);
		}
		return false;
	}
	
	public boolean listCustomers(String branchName, boolean showTransactions) {
		Branches branch = findBranch(branchName);
		if (branch != null) {
			System.out.println("Customer details for branch " + branch.getBranchName());

			ArrayList<Customer> branchCustomers = branch.getCustomersList();

			for (int i = 0; i < branchCustomers.size(); i++) {
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("Customers  " + branchCustomer.getCustomerName() + "[ " + (i + 1) + " ]");
				if (showTransactions) {
					System.out.println("Transactions ");
					ArrayList<Double> transactions = branchCustomer.getTransactions();
					for (int j = 0; j < transactions.size(); j++) {
						System.out.println("[ " + (j + 1) + " ] Amount" + transactions.get(j));
					}
				}
			}
			return true;
		} else {
			return false;
		}
	}

}
	 

