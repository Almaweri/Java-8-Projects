package course.training;

public class ClassBankCodeBean {

	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;

	
	
	
	
	public ClassBankCodeBean(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		
		System.out.println("constructor call with out par");

	}

	
	public void deposit(double depositFunds) {
		this.balance += depositFunds;
		System.out.println("Deposit 0f (" + depositFunds + "). New funds werer made  " + this.balance);
	}

	public void withdraw(double withdrawFunds) {
		if (this.balance - withdrawFunds < 0) {
			System.out.println("Only " + this.balance + "of funds is avalialbe. Withdraw will not proceed");
		} else {
			this.balance -= withdrawFunds;
			System.out.println(
					"Withdraw of" + withdrawFunds + " has been proceeded " + " new balance is " + this.balance);
		}
	}
	
	
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
