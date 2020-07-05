package course.training;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person();
		person.setFirstName("Maged");
		person.setLastName("");
		person.setAge(55);
		
		person.setFullName(person.getFirstName() + " " + person.getLastName());
		System.out.println("Full Name is: " + person.getFullName() + " and the age is: "+ person.getAge());
		System.out.println("teen " + person.isTeen());
	
	
	}
}
