package course.training.chanllenges;

public class Vehicle {
	private String brand;
	private String color;
	private int model;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", color=" + color + ", model=" + model + "]";
	}
	

	
}
