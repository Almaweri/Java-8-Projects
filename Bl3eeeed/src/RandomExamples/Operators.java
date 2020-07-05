package RandomExamples;

public class Operators {
	
	public static void main(String[] args) {
	//	boolA();
	}
	public boolean isSleeping () {
		System.out.println("isSleep[ing()");
		return false;
	}
	
	public boolean isHome() {
		System.out.println("isHome()");
		return true;
	}
	
	public void boolA() {
		if (isSleeping() & isHome()) {
			System.out.println("BoolA: shhh ... Jason's sleeping");
		}
	}

}
