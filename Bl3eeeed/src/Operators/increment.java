package Operators;

public class increment {

	public static void main(String[] args) {
		// x++ = [old value: 0, new value: 1, return old value]
		// ++x = [old value: 1, new value: 2, return new value]
		
		int x = 0;
		System.out.println(x++);
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x);
		
	}
	
	public boolean isSleeping () {
		System.out.println("isSleep[ing()");
		return false;
	}
	
	public void ternary () {
		String status = "";
		if(isSleeping()) {
			status = "Sleeping";
		} else {
			status = "Working";
		}
		
		String status2 = isSleeping() ? "Sleeping" : "Working";
		
		System.out.println("Status 1 = " + status);
		System.out.println("Status  " + status2);
		
		return;
	}
	 
}
