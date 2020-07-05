package course.training;

public class HouseMain {
	public static void main(String[] args) {
		
	
	House blueHouse = new House("BLue");
	House anotherHouse = blueHouse;
	
	System.out.println(blueHouse.getColor());
	System.out.println(anotherHouse.getColor());
	
	anotherHouse.setColor("Red");
	System.out.println(blueHouse.getColor());
	System.out.println(anotherHouse.getColor());

	House greenHouse = new House("Green");
	anotherHouse = greenHouse;
	System.out.println(greenHouse.getColor());
	
	System.out.println(blueHouse.getColor());
	System.out.println(anotherHouse.getColor());
	System.out.println(greenHouse.getColor());
}
}
