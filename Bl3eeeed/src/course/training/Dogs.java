package course.training;

public class Dogs {

	private String name;
	//private static String name; This static word could cause all the name values to be the same and prints only Marks twice. 
	
	public Dogs(String name) {
		this.name = name;
		//Dogs.name = name;
	}
	
	
	public void printName() {
		System.out.println("The Dog Name is:" + name);
	}
	
	public static void main(String[] args) {
		Dogs dogName = new Dogs("Goody");		
		Dogs dogName2 = new Dogs("Marks");
		
		dogName.printName();
		dogName2.printName();
	}
	
}
