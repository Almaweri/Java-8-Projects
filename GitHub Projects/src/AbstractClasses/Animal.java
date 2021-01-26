package AbstractClasses;


public abstract class Animal {
	
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    
    // Initializing abstract methods with no body in the main abstract class
    public abstract void eat();
    public abstract void breathe();

    // Getter for the name which will be used in the other class.
    public String getName() {
        return name;
    }
}
