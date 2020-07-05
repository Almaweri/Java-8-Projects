package course.training;

public class BankMainClass {

	
	public static void main(String[] args) {
		depositFunds();
		withdrowFunds();
		
	}
	private static void depositFunds() {
		BankAccountBean bank = new BankAccountBean();
		bank.setAccountNumber(5733);
		bank.setCustomerName("Maged Almaweri");
		bank.setBalance(3000000);
		bank.setEmail("maged.almaweri@yahoo.com");
		bank.setPhoneNumber(313600781);
		// allow the user to deposit funds, this should increment the balance.
		double  deposit = 9091000;
		System.out.println("Deposit is " + deposit);
		double oldBalance = bank.getBalance();
		System.out.println("old balance" + oldBalance);
		double newBalance = deposit + oldBalance;
		
		
		System.out.println("New balance is " + newBalance);
		System.out.println("-----------------------");
		
	}
	
	
private static void withdrowFunds() {
	BankAccountBean bank = new BankAccountBean();
	bank.setAccountNumber(5733);
	bank.setCustomerName("Maged Almaweri");
	bank.setBalance(1000);
	bank.setEmail("maged.almaweri@yahoo.com");
	bank.setPhoneNumber(313600781);
	
	double  withdraw = 1000;
	System.out.println("withdraw = " + withdraw);
	double oldBalance = bank.getBalance();
	System.out.println("old balance = " + oldBalance);
	double newBalance = withdraw - oldBalance;

	if (oldBalance < withdraw) {
		System.out.println("Only " + oldBalance + " balance available. No sufficient balance");
	}
	else {
		System.out.println("New balance = " + newBalance);

	}
	
	
	}

}
