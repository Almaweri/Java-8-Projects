package course.training;

public class ClassBankCodeMain {
	public static void main(String[] args) {

		ClassBankCodeBean magedAccount = new ClassBankCodeBean(123, 190000, "maged.ajkgjf", "lkasghlkh", "gdfgdf");
		magedAccount.withdraw(100);
		
		System.out.println("account num " + magedAccount.getAccountNumber());
		
		magedAccount.deposit(1000);
		magedAccount.withdraw(500);
		
		/*
		 * ClassBankCodeBean nass = new ClassBankCodeBean(242, 9000000, "Maged",
		 * "maged@yahoo.com", "313788"); System.out.println(nass.getAccountNumber());
		 * System.out.println(nass.getBalance());
		 * System.out.println(nass.getCustomerName());
		 * 
		 */
		
		
		VipCustomers vip = new VipCustomers("Maged", 3000, "maged.yahoo.com");
		System.out.println(vip.getName());
		System.out.println(vip.getCreditLimit());
		System.out.println(vip.getEmailAddress());
		vip.getName().toString();
		
		
		VipCustomers vip2 = new VipCustomers("Naserrrr", 76);
		System.out.println("Inside vip2");
		System.out.println(vip2.getName());
		System.out.println(vip2.getCreditLimit());
		System.out.println(vip2.getEmailAddress());
		
		VipCustomers vip3 = new VipCustomers("Da", 434343,"wmail@yaod.com");
		System.out.println(vip3.getEmailAddress());
		System.out.println(vip3.getName());
	}
}
