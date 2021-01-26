package RandomExamples;

	
	public class Person {
	    {
	        personCount = 10;
	    }
	    static {
	        personCount = 20;
	    }
	    private static int personCount = 1000;
	    {
	        personCount = 30;
	    }
	    static {
	        personCount = 40;
	    }
	    public static void main(String[] args) {
	       System.out.println(Person.personCount); // Line A 
	       Person p = new Person(); // Line B
	       System.out.println(Person.personCount); // Line C
	       Person.personCount = 100; // Line D 
	       p = new Person(); // Line E
	       System.out.println(Person.personCount); // Line F
	    }
	}

	
	
	/* 
	 * When the program starts and this main method is kicked off, the Person class is loaded.  This, in turn, makes the static personCount variable available, with a default value of 0 (remember, all instance and static variables start with default values).

Next all of the static initialization blocks, and the static variable's explicit initialization are executed in the order they are listed, from top to bottom.  Therefore, the personCount variable is set to 20, 1000, and finally 40.  So Line A prints "40."

On Line B, an object is instantiated, so that causes the instance initialization blocks to be executed in the order they are listed, from top to bottom.  So now personCount is changed to 10 and finally 30.  Line C prints the value "30."

Line D changes the personCount to 100, but Line E causes the instance initialilzation blocks to be executed again.  Therefore, the final value printed in Line F is, once again, "30."  So the answer to the quiz is: 

40

30

30
	 */
