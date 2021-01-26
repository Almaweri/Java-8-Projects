package InterFace_InnerClasses;

public class Main {

	public static void main(String[] args) {
		DeskPhone magedPhone;
		magedPhone = new DeskPhone(3136);
		magedPhone.powerOn();
		magedPhone.callPhone(3136);
		magedPhone.answer();
		
		MobilePhone myPhone;
		myPhone = new MobilePhone(2244);
		myPhone.powerOn();
		myPhone.callPhone(2244);
		myPhone.answer();
		myPhone.dial(2244);
	}
	
}
