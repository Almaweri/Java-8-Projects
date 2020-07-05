package Class101AndUp;

public class PrintDecrement {

	public static void main(String[] args) {
		
		String site = "www.yahoo.com";
		
		for (int i = site.length()-1; i >= 0; i--) {
			char ch = site.charAt(i);
			System.out.print(ch);
		}
		
	}
	
}
