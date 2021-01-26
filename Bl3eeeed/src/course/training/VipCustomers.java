package course.training;

public class VipCustomers {

	
	private String name;
	private int creditLimit;
	private String emailAddress;
	

	public VipCustomers() {
		this("default name", 50000, "default@email.com");
}
	
	
	
	
	public VipCustomers(String name, int creditLimit) {
		this("Naww", 5000, "Unknown@yho");
	}




	public VipCustomers(String name, int creditLimit, String emailAddress) {
		super();
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
		
		
		
		
		
	}





	public String getName() {
		return name;
	}


	public int getCreditLimit() {
		return creditLimit;
	}


	public String getEmailAddress() {
		return emailAddress;
	}
	
	
	
	
}
