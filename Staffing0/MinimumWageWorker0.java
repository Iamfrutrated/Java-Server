public class MinimumWageWorker0 extends Staff0 	// MinimumWageWorker0 extends Staff0, allowing it access to the protected field variables
						// income and money. It also grants access the work() method, however that is not
						// demonstrated here.
{
	public MinimumWageWorker0() // no-args constructor
	{
		
		income = 1; 	// The income and money variables were never declared yet they can be used because they were derived from
		money = 1; 	// the parent class, Staff0, which had all of these variables. Note that these two lines do not directly
				// affect the field variables in the parent class, they only change the value in this particular class
	}
}
