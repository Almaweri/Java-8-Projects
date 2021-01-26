package Inheritance;


public class Liquid extends Good{
	private double radius;

	//Add a Liquid constructor that reuses the super-class constructor (Good), but adds the additional radius parameter.
	public Liquid(String name, int modelNumber, double height, UnitOfMeasureType unitOfMeasure, boolean flammable,
			double weightPerUofM, double radius) {
		super(name, modelNumber, height, unitOfMeasure, flammable, weightPerUofM);
		this.radius = radius;
	}


	// Override the Good class’s volume( ) method to provide the volume for a cylinder of the liquid.
	
	
	public double getRadius() {
		return radius;
	}

	// Override the Good class’s volume( ) method to provide the volume for a cylinder of the liquid.
	
	@Override
	public double volume() {
		return Math.PI * radius *  radius * getHeight();
	}

	
	// Override the super class’s toString( ) method. The toString( ) method for a Solid should display the name and model number, as well as the volume of the product.
	@Override
	public String toString() {

		return super.toString() + " (liquid) " + volume() + " " +
				getUnitOfMeasure();
	}

	
	

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
