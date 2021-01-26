package JavaSyntax;

public class SwitchExample {

	public static void main(String[] args) {
		
		int j = 3;
		String str = null;
		
		switch (j) {
		case 1:
		str = "One";
		break;
		case 2:
			str = "Two";
			break;
			case 3:
				str = "Three";
				break;
			case 4:
				str = "Four";
				break;
				default:
					str = "Unknown";
		}
		System.out.println(str);
		
		///////////////////
		
		char c = 'A';
		switch (c) {
		case 'A':
			System.out.println("is A");
			break;
		case 'B':
			System.out.println("is B");
			break;
			default:
				System.out.println("char =" + c);
				break;
		}
		////////////////////
		String timeOfTheDay = "a.m.";
		switch (timeOfTheDay) {
			case "a.m.":
				System.out.println("Good Morning");
				break;
			case "p.m.":
				System.out.println("Good evening");
				break;
				default:
					System.out.println("Good Day");
		}
		///////////////////////
		
		
		int k = 2;
		String strr;
		switch (k) {
		case 1:
		case 3:
			strr =  "odd";
			break;
		case 2:
		case 4:
			 strr = "even";
			break;
			default:
				strr = "out of range...";
				break;
		}
		
		System.out.println("Strr is:" +  strr);
	}
	
}
