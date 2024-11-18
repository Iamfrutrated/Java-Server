// 11-17-24
// https://open.kattis.com/problems/goldbach2 		Good example for recursion
// You will not be able to submit because it is not the fully structured code
// The final version requires you to do some output formatting which is slightly annoying because arrays have not been "taught" yet

import java.util.Scanner;

public class Recursion1
{
	private int numWays;		// Just for counting purposes
	
	public Recursion1()
	{
		numWays = 0;		// always starts at zero, makes no sense any other logical way (works with any value but makes more sense this way)
	}

	// average main stuff, not much to say
	
	public static void main(String[] args)
	{
		Recursion1 r1 = new Recursion1();
		r1.runIt();
	}

	// this is the real "main" method
	
	public void runIt()
	{
		int numInputs = getInput();		// this is the "n" value
		
		for(int i = 0; i < numInputs; i ++)	// you then take in n inputs
		{
			numWays = 0;			// always reset to zero, try to figure out why, if you can't dm me
			int originalNum;		// could've put these two on one line
			originalNum = getInput();
			operate(2, 2, originalNum);	// very important method, starts at 2,2 because the prompt makes 1,1 redundant
			
			// the secondary output, this is the part that doesn't line up with the original problem
			System.out.print("Number of ways this number can be split into two primes: ");
			System.out.println(numWays);
		}
	}
			
	// quite simple, not much to say at all
	
	public int getInput()
	{
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		
		return input;
	}

	// things get interesting here, num could've been a field variable but I just chose parameter for no real reason
	// code would've looked cleaner if it was a field variable but I wasn't really taking that into account at the moment when I was
	// coding it up
	
	public void operate(int testNum1, int testNum2, int num)
	{
		

		// highly recommend this method for debugging infinite recursion errors
		
		// --------------------------------------------------------------------------------------------------------------------------------
		
		// Scanner in = new Scanner(System.in);
		// System.out.printf("%d, %d %n", testNum1, testNum2);
		// in.nextLine();
		
		// --------------------------------------------------------------------------------------------------------------------------------

		boolean tN1check = primeChecker(2, testNum1);		// check if they are primes, I used a variable because
		boolean tN2check = primeChecker(2, testNum2);		// I will use them multiple times later on and it looks cleaner
									// this way
		
		
		if(testNum1 > num/2)					// You don't need to be a mathematical genius to figure this one
			return;						// out
		
			
		if(testNum1 + testNum2 > num)				// This is the second restriction, pretty obvious why I put it here
		{
			operate(testNum1 + 1, 2, num);			// This resets them and updates the testNum1 value
			return;						// VERY IMPORTANT TO UNDERSTAND WHY RETURN IS HERE
		}							// if you don't dm me

		// This is the ultimate success condition
		if(tN1check && tN2check && testNum1 + testNum2 == num)
		{	
			printSuccess(testNum1, testNum2);		// using the method to print 
			operate(testNum1 + 1, 2, num);			// resetting values
			numWays ++;
			return;
		}

		// partial success condition
		// This was part of my ORIGINAL code, basically the first draft, and I didn't care to polish it
		// This chunk might be completely useless but I would need to double check
		
		if(tN1check)
			operate(testNum1, testNum2 + 1, num);		
		else
			operate(testNum1 + 1, testNum2, num);
	}




	// DO NOT SCROLL DOWN UNTIL READING

	

	/* This next  method alone can be counted as an exercise. Although the code seems simple, before you look at it, try to 
 	 * replicate it. This method checks whether or not the number inputted is a prime, returns a boolean
	 */











	









	
	
	public boolean primeChecker(int testNum, int num)
	{
		if(num == 1)			// applying all these rules will result in 1 being a prime
			return false;
			
		if(num == 2 || num == 3)	// try and figure out why I had to include 3 in here
			return true;
			
		if(num % testNum == 0)
			return false;
		
		if(testNum == num/3)
			return true;
		
		return primeChecker(testNum + 1, num);
	}

	// Personal preference: I like to see the piece of code that says printSucess(var1, var2); rather than what is shown inside the method
	public void printSuccess(int prime1, int prime2)
	{
		System.out.printf("%d + %d %n", prime1, prime2);
	}
}
