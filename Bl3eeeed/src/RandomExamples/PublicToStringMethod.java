package RandomExamples;

import java.util.*;

/**
 * @author maged
 *
 */
public class PublicToStringMethod {

	String name;
	String address;
	int bankAccount;
	int balance;
	
	public PublicToStringMethod(String name, String addr, int acc, int bal) {

		this.name = name;
		this.address = addr;
		this.bankAccount = acc;
		this.balance = bal;
	}
	
	
	public static void main(String[] args) {

		List<PublicToStringMethod> list = new ArrayList<PublicToStringMethod>();

		PublicToStringMethod b1 = new PublicToStringMethod("naseem1", "Darbhanga,bihar", 123, 1000);
		PublicToStringMethod b2 = new PublicToStringMethod("naseem2", "patna,bihar", 124, 1500);
		PublicToStringMethod b3 = new PublicToStringMethod("naseem3", "madhubani,bihar", 125, 1600);
		PublicToStringMethod b4 = new PublicToStringMethod("naseem4", "samastipur,bihar", 126, 1700);
		PublicToStringMethod b5 = new PublicToStringMethod("naseem5", "muzafferpur,bihar", 127, 1800);

		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		Iterator<PublicToStringMethod> cusData = list.iterator();

		while (cusData.hasNext()) {
			System.out.println(cusData.next());

		}
	}


	@Override
	public String toString() {
 		return "Name: " + name + "\n  Address: " + address + "\n Account number:  " + bankAccount + "\n  Balance: " + balance;
	}

}
