package Class101AndUp;

public class Calc {

	public int Sum(int one, int two) {
		return one + two;
	}
	
	public int Min(int one, int two) {
		return one - two;
	}
	
	public int Mul(int one, int two) {
		return one * two;
	}
	
	public int Div(int one, int two) {
		
		if (two ==0) {
			return 0;
		} else {
			return one / two;
		}
			
	}
	
	public void decr (int value) {
		for (int i = value; i >= 1; i--) {
			System.out.println("I: ss" + i);
		}
		
		int c = value;
		while (c >= 1) {
			System.out.println("C: " + c);
		c--;
		}
	}
	
}
