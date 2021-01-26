package AbstractClasses;


public class Dog extends Animal {

	// Constructor and it takes the [String name] variable from the main Abstract class Animal
    public Dog(String name) {
        super(name);
    }
    
    // overriding the methods and adding new data.
    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");

    }
}
