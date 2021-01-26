package InterFace_InnerClasses;

public class DeskPhone implements ITelephone {

	private int myNumber;
	private boolean isRinging;
	
	public DeskPhone(int myNumber) {
		this.myNumber = myNumber;
	}
	

	@Override
	public void powerOn() {
		System.out.println("No action taken, desk phone does not have a power button");
		
	}
	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + " on Desktop");
		
	}
	@Override
	public void answer() {
		if (isRinging) { // means if it true
			System.out.println("Answering the desk phone");
		isRinging = false;
		}
		
	}
	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("Ring Ring");
		}
		return false;
	}
	@Override
	public boolean isRinging() {
		return isRinging;
	}
	
	
		
	
}
