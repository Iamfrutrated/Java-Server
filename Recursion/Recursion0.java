// NumberSequences but with recursion (no loops)
// Description for NumberSequences: https://mvhs-fuhsd.org/john_conlin/Java/HW_folder_Java/1stSemDocs/Unit05-Loops/NumberSequence.pdf

import java.lang.Math;		// don't import this if you don't have to. My java version makes it so I have to
import java.util.Scanner;	// importing Scanner
 
public class Recursion0
{
	// field variables
	
	private int nextNum;			// the next number in the sequence
	private int incrementNum;		// the amount the sequence is incremented by
	private int sequenceLength;		// length of the sequence (except for nextNum)
	private int userInputInt;		// the number the user inputs 
	private String userInputPattern;	// the text the user inputs (EX: "increase by", "plus", "subtract", etc.)
	
	public Recursion0()
	{
		// initializing the field variables
		// Good programming practice and it sometimes (meaning if the error occurs) prevents the error: variable may not have
		// been initialized yet.
		
		nextNum = -1;
		incrementNum = -1;
		sequenceLength = -1;
		userInputPattern = "hello world";
	}
	
	public static void main(String[] args)
	{
		Recursion0 r0 = new Recursion0();	// creating an object of the class
		r0.runIt();				// using the object to run runIt()
	}

	/*
 	 * This method is the method that runs "everthing"
   	 * It sets up the structure of the program. (Like the overview or very broad pseudocode)
	*/
	
	public void runIt()
	{
		int a0 = generateValues();			// a0 means the first term of the sequence
		sequencePrinter(a0, sequenceLength);		// this prints out the sequence
		System.out.println("__");			// this is to print out the final underscores after the sequence
		
		initInput(3);					// this is to start the input, the 3 is because the user gets three 
								// tries to get the answer right. 
	}

	/* This method uses recursion to get the inputs.
	 * The recursion terminates when runNum == 0, and runNum is decremented each time the recursion happens
         * First stage of input --> nextNum
	 */
	
	public void initInput(int runNum)
	{	
		// This is the check to exit the recursion
		if(runNum == 0)
			return;
		
		Scanner in = new Scanner(System.in);			// creating Scanner object
		
		System.out.print("What is the next number? ");		// prompting the input
		int userGuess = in.nextInt();				// grabbing the input(initial number)

		// checks if user was correct
		
		if(userGuess != nextNum)	// if user was wrong			
		{
			if(runNum != 1)					// This check is because if runNum == 1, this is their final
									// attempt, and if they get it wrong, there is no trying again
				
				System.out.println("Try again");	// self explanatory
			
			initInput(runNum - 1);	// this sets the value for runNum in the parameter to runNum - 1, which decrements
						// runNum until it becomes zero 
		}
		else				// if user was correct
			finalInput();		// second stage of the input --> pattern

		
	}
	
	public void finalInput()
	{
		Scanner kb = new Scanner(System.in);	// I avoided using in because I could differentiate them better
		
		System.out.print("What's the pattern? ");	// prompting the input
		
		userInputPattern = kb.next();			// getting the first word
		
		if(userInputPattern.equalsIgnoreCase("increment") || userInputPattern.equalsIgnoreCase("increase"))
		{
			
			String secondWord = kb.next();			// anything in this for loop will have a second word
			
			if(!(secondWord.equalsIgnoreCase("by")))	// only if the second word is "by", it works
			{
				generateErrorResponse();		// generates the error response because the word was not "by"
				return;					// exits the method, which then exits the program
			}
				
			userInputInt = kb.nextInt();			// getting the number input
			
		}
		else if(userInputPattern.equalsIgnoreCase("add") || userInputPattern.equalsIgnoreCase("plus"))	// checks for other correct cases
			userInputInt = kb.nextInt();
		else						// prevents Calvin from breaking the program by typing in "skibidi"
		{
			generateErrorResponse();
			return;
		}

		// if the text part is correct, now the number needs to be checked

		if(userInputInt != incrementNum)		// comparing the number input to the correct answer
		{
			generateErrorResponse();		// the user got the number wrong so the error message is sent
			return;					// exits the method, which then exits the program
		}
		
		generateCorrectResponse();	// if the user hasn't exited the program in all above error cases, then they are correct
	}

	// because the instructions don't let me use loops, I use recursion here.
	
	public void sequencePrinter(int curNum, int runNum)		// curNum and runNum change as seen on line 137
	{
		if(runNum == 0)		// when runNum is 0, the sequence is over
		{
			return;		// exits the method and stops the recursion
		}
		
		System.out.print(curNum);	// prints out the number in the sequence
		System.out.print(", ");		// the comma and the space need to be in
		
		sequencePrinter(curNum + incrementNum, runNum - 1);	// plugging in new values to do the operation
	}

	
	// making the sequence randomized
	
	public int generateValues()
	{
		incrementNum = (int)(Math.random() * 10) + 1;
		sequenceLength = (int)(Math.random() * 5) + 5;
		
		final int STARTNUM = (int)(Math.random() * 21) - 10;
		
		nextNum = STARTNUM + incrementNum * (sequenceLength);
		
		return STARTNUM;
	}
	
	// essentially "useless" methods, but it allows for people to understand it written in the code more clearly
	
	public void generateErrorResponse()
	{
		System.out.printf("Incorrect. It was not %s%d. It was add %d.", userInputPattern, userInputInt, incrementNum);
	}

	public void generateCorrectResponse()
	{
		System.out.printf("Correct. It was add %d.", incrementNum);
	}
}
