package course.training.chanllenges;

public class Car extends Vehicle {
	
	private String steer;
	private int speed;
	private int gear;

	
	
	
	
	public Car(String steer, int speed, int gear) {
		super();
		this.steer = steer;
		this.speed = speed;
		this.gear = gear;
	}
	

	public String getSteer() {
		return steer;
	}
	public void setSteer(String steer) {
		this.steer = steer;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	@Override
	public String toString() {
		return "Car [steer=" + steer + ", speed=" + speed + ", gear=" + gear + "]";
	}

	
	
}
