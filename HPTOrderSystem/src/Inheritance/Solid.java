package Inheritance;

import Inheritance.Good.UnitOfMeasureType;

public class Solid extends Good {
	
	private double width;
	private double length;

	
	//Add a Solid constructor that reuses the super-class constructor (Good) but adds the additional width and length parameters.
	public Solid(String name, int modelNumber, double height, UnitOfMeasureType uoM, boolean flammable,
			double wgtPerUofM, double width, double length) {
		super(name, modelNumber, height, uoM, flammable, wgtPerUofM);
		this.width = width;
		this.length = length;
	}
	
	// Override the Good class’s volume( ) method to provide the volume( ) for the container of the solid.
	public double volume() {
		return width * length * getHeight();
		}
	// Override the super class’s toString( ) method. The toString( ) method for a
	//Solid should display the name and model number, as well as the volume of the product.
	public String toString() {
		return super.toString() + " that is " + volume() + " " +
		getUnitOfMeasure() + " in size";
		}
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	

	
	
}
