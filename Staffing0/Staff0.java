//Staff0.java

public class Staff0
{
	protected float income; // theses lines declare a field variable with the access specifier of protected, which allows classes that
	protected float money; 	// are derived from it to access them directly without the use of a getter method. 
				// These variables are used later in the MinimumWageWorker0 class (see that class for details).
	
	public Staff0()
	{
		// no-args constructor
		// this constructor is just here for the sake of having a constructor
	}
	
	public void work() // this establishes a method within the class that all class derived from it can use
	{
		System.out.println("You worked for no pay."); // outputs
	} 
}
