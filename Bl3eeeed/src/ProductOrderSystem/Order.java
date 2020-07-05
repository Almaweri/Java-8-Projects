package ProductOrderSystem;

public class Order {
	MyDate orderDate;  // Referenced variable 
	double orderAmount = 0.00; // Instance variable
	String customer; // Instance variable;
	String product; // Instance variable;
	int quantity; // Instance variable;
	static double taxRate = 0.05; // Add a static variable, taxRate, to the Order class, and initialize the tax rate to 5%. 

	
	// d, amt, c, p, q are instance variable
	public Order(MyDate d, double amt, String c, String p, int q){
		orderDate=d;  // Referenced variables
		orderAmount=amt; 
		customer=c;
		product=p;
		quantity=q;
	}
	
	
	public Order() {
		
	}
	
	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}
	//Add a static method to the Order class to set a new taxRate. 
	public static void setTaxRate (double newRate) {
		
	}
	// Add another static method to compute the tax on an amount provided as a parameter. 
	public static void computeTaxOn (double anAmount) {
		System.out.println("The tax for " + anAmount + " is: " + anAmount * Order.taxRate);
	}
	
	// Add a new method to compute the tax for an Order object.
	
	public double computeTax() {
		
		System.out.println("The tax for this order is: " + orderAmount * Order.taxRate);
		return orderAmount * Order.taxRate;
		
		
	}
	
}
