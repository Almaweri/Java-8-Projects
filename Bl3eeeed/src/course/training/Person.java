package course.training;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String fullName;
	private boolean teen;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if (lastName != null) {
		this.lastName = lastName;
		} else {
			setLastName(null);
			
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 0 || age > 100 ) {
			age = 0;
			}
					
		this.age = age;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public boolean isTeen() {
		if (age >12 && age < 18) {
			
		return true;
		} else {
			return false;

		}
	}
	public void setTeen(boolean teen) {
		this.teen = teen;
	}
	
	
}
