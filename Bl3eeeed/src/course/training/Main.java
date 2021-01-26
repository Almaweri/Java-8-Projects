package course.training;

public class Main {
	
	public static void main(String[] args) {
		// in order to access the variales in the CarBean [doors, wheels, model,....], you have to initialize a new objects with the cars names [Toyota, ...]
		// after the initialization, you have to set the values.
		// them get the values and print them out.
		
		CarBean porshe = new CarBean();
		CarBean holden = new CarBean();
		porshe.setModel("911");
		holden.setDoors(4);
		
		String modell = porshe.getModel();
		System.out.println(modell);
		
	}

}
