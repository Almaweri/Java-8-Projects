package MobilePhoneChallenge;

public class ContactBean {
	
	private String name;
	private String phoneNumber;
	
	// Add construtor
	public ContactBean(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	// Add getters only
	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	// ??
	public static ContactBean createContact (String name, String phoneNumber) {
		return new ContactBean(name, phoneNumber);
	}
	

}
