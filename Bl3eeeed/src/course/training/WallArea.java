package course.training;

public class WallArea {

	double wallWidth = 100d;
	double wallHeitght = 500d;
	
	public WallArea() {
	}

	public WallArea(double wallWidth, double wallHeitght) {
		
		  this.wallWidth = wallWidth; this.wallHeitght = wallHeitght;
		 
	}

	public double getWallWidth() {
		return wallWidth;
	}

	public void setWallWidth(double wallWidth) {
		if (wallWidth < 0) {
			this.wallWidth = 0;
		} else {
		this.wallWidth = wallWidth;
	}
	}

	public double getWallHeitght() {
		
		return wallHeitght;
	}

	public void setWallHeitght(double wallHeitght) {
		if (wallHeitght < 0) {
			this.wallHeitght = 0;
		} else {
		this.wallHeitght = wallHeitght;
	}
	}

	
	public static void main(String[] args) {
		
		WallArea newWall = new WallArea(43, 34);
		System.out.println(newWall.getWallHeitght());
		
		newWall.setWallHeitght(-9);
		System.out.println("new valueeees  --->  "+ newWall.getWallHeitght());
	}
}
