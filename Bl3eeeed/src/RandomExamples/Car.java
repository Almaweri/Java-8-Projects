package RandomExamples;

public class Car {

	String color;
	String type;
	{
		this.color = "red";
		System.out.println(this.color = "red");
		this.type = "Celica";
	}
	
	String getDescription() {
		String desc = "This is a " + this.color + " " + this.type; 
		System.err.println(desc);
		return desc;
	}
	
	// Customize Frame: newColor = blue  newType = convertible
	
	void customize (String color, String type) {
		
		this.color = color;
		this.type = type;
		
		System.out.println(getDescription());
	}
	
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.customize("Blue", "convertible");
	}
}
