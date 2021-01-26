package BankingApplication;

public class Main {
	
	public static void main(String[] args) {
		
		Bank bank = new Bank("Bank of America");
		
		bank.addBranch("Tenn");
		
		bank.addCustomer("Tenn", "Maged", 1000.00);
		bank.addCustomer("Tenn", "Nasser", 6000.00);
		bank.addCustomer("Tenn", "Moh", 700.00);
		bank.addCustomer("Tenn", "Mira", 670.00);
		bank.addCustomer("Tenn", "Ali", 1600.00);

		bank.addBranch("Dearborn");
		bank.addCustomer("Dearborn", "Sarah", 20000.00);
		
		bank.addCustomerTransaction("Tenn", "Maged", 50000.00);
		bank.addCustomerTransaction("Tenn", "Maged", 90000.00);
		bank.addCustomerTransaction("Tenn", "Mira", 70000.00);
		
		bank.listCustomers("Tenn",true);
		bank.listCustomers("Dearborn",true);
	}
	

}
