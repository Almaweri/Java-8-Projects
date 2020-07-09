package Inheritance;

public class Good {

	public enum UnitOfMeasureType {
		LITER, GALLON, CUBIC_METTER, CUBIC_FEET
		}
	private String name;
	private int modelNumber;
	private double height;
	private UnitOfMeasureType unitOfMeasure;
	private boolean flammable;
	private double weightPerUofM;

	//Add a constructor to create a Good with a name, model number, height, unit of measure, and flammability.
	public Good(String name, int modelNumber, double height, UnitOfMeasureType unitOfMeasure, boolean flammable,
			double weightPerUofM) {
		super();
		this.name = name;
		this.modelNumber = modelNumber;
		this.height = height;
		this.unitOfMeasure = unitOfMeasure;
		this.flammable = flammable;
		this.weightPerUofM = weightPerUofM;
	}
	
	
	// Add a toString( ) method to Good. The toString( ) method for Good should display the name and model number for Good.
	public String toString () {
		return name + "_" + modelNumber;
	}
	
	
	// Add a method to provide the volume of the good. Volume varies based on the dimensions of the good. In the case of a generic good, return zero as the volume.
	public double volume () {
		return 0.0;
	}
	
	// Add a method to provide the weight of the good. The weight is equal to the volume times the weight per unit of measure.
	public double weight () {
		
		return volume() * weightPerUofM;
	}
	
	
	//Properly encapsulate these properties by generating public getter and setter methods for each.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public UnitOfMeasureType getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(UnitOfMeasureType unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	public boolean isFlammable() {
		return flammable;
	}
	public void setFlammable(boolean flammable) {
		this.flammable = flammable;
	}
	public double getWeightPerUofM() {
		return weightPerUofM;
	}
	public void setWeightPerUofM(double weightPerUofM) {
		this.weightPerUofM = weightPerUofM;
	}
	
	
}

