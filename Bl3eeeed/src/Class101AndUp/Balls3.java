package Class101AndUp;

public class Balls3 {

	
	public static void main(String[] args) {
		int first;
		int second;
		int third;
		
		int[] balls = {1,3, 5, 7, 9, 11, 13, 15};
		 for (int i : balls) {
		if (i + i + i == 30) {
			System.out.println("i is ==> " + i);
		} else {
			System.out.println("Not " + i);
		}
		}
		 
	}
	
}
