package course.training.chanllenges;

public class Toyota extends Car{

	private String appStart;
	private String parkingHelper;
	


	public Toyota(String steer, int speed, int gear, String appStart, String parkingHelper) {
		super(steer, speed, gear);
		this.appStart = appStart;
		this.parkingHelper = parkingHelper;
	}


	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * Vehicle newVehicle = new Vehicle(); newVehicle.setBrand("Toyota");
	 * newVehicle.setColor("Blue"); newVehicle.setModel(2020);
	 * 
	 * String brand = newVehicle.getBrand(); String carColor =
	 * newVehicle.getColor(); int carModel = newVehicle.getModel();
	 * 
	 * 
	 * }
	 */


	public String getParkingHelper() {
		return parkingHelper;
	}


	public void setParkingHelper(String parkingHelper) {
		this.parkingHelper = parkingHelper;
	}


	public String getAppStart() {
		return appStart;
	}


	public void setAppStart(String appStart) {
		this.appStart = appStart;
	}
	
}
