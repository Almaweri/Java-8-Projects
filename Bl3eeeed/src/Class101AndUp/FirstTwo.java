package Class101AndUp;

public class FirstTwo {

	
	public static void main(String[] args) {
		
	
	Calc c = new Calc();
	int sum = c.Sum(10, 20);
	System.out.println("sum is: " + sum);
	int min = c.Min(10, 20);
	System.out.println("sub is: " + min);
	int sub = c.Mul(20, 10);
	System.out.println("mult is: " + sub);
	int div = c.Div(20, 10);
	System.out.println("div is: " + div);
	
	
	 c.decr(5);
	
	}
	
	
}
