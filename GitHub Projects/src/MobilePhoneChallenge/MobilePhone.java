package MobilePhoneChallenge;

import java.util.ArrayList;

public class MobilePhone {

	private String myNumber;
	private ArrayList<ContactBean> myContactsList;
	
	// create a constructor
	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContactsList = new ArrayList<ContactBean>();
	}
	
	// Check if the contact Exist first
	  public boolean addNewContact(ContactBean contact) {
	        if(findContactName(contact.getName()) >=0) { // findcontactName method accepts one parameter ==> we added the name we have in the list to check it
	            System.out.println("Contact is already on file");
	            return false;
	        }
		// if it does not exist the add it to the contact list
		myContactsList.add(contact);
		return true;
	}
	
	
	public boolean updateContact (ContactBean oldContact, ContactBean newContact) {
		int foundPosition = findContactIndex(oldContact);
		if(foundPosition <0) {
			System.out.println(oldContact.getName() + ", was not found");
			return false;
		} else if (findContactName(newContact.getName()) != -1 ) {
			System.out.println("Contact with name " + newContact.getName() + 
								" already exists. Update was not successful");
			return false;
		}
		// if found 
		this.myContactsList.set(foundPosition, newContact);
		System.out.println(oldContact.getName() +  ", was replaced with  " + newContact);
		return true;
	}
	
	public boolean removeContact (ContactBean contact) {
		int foundPosition = findContactIndex(contact);
		if(foundPosition < 0) {
			System.out.println(contact.getName());
			return false;
		}
		myContactsList.remove(foundPosition);
		System.out.println(contact.getName() + ", was deleted.");
		return true;
	}
	// find the contact by its index in the arraylist which has all the contacts info [index = int]
	private int findContactIndex(ContactBean contact) {
		return this.myContactsList.indexOf(contact);
	}
	// looking only for the name in the list [ Compare the name in the list to the one the user will enter
	private int findContactName(String contactName) {
		for (int i = 0; i < this.myContactsList.size(); i++) {
			ContactBean contact = this.myContactsList.get(i);
			if(contact.getName().equals(contactName)) { // comparing
				return i;
			}
		}
		return -1;
	}
	
	public String queryContact(ContactBean contact) {
		if(findContactIndex(contact) >= 0) {
			return contact.getName();
			
		}
		return null;
	}
	
	
	   public ContactBean queryContact(String name) {
	        int position = findContactName(name);
	        if(position >=0) {
	            return this.myContactsList.get(position);
	        }

	        return null;
	    }

	public void printContacts() {
		System.out.println("Contact List");
		for (int i=0; i<this.myContactsList.size(); i++) {
			System.out.println((i+1) + "." + 
								this.myContactsList.get(i).getName() + " --> " +
								this.myContactsList.get(i).getPhoneNumber());
				
		}
	}
	
}
