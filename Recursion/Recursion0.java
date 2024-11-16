// NumberSequences but with recursion (no loops)

import java.lang.Math;
import java.util.Scanner;
 
public class Recursion0
{
	private int nextNum;
	private int incrementNum;
	private int sequenceLength;
	private int userInputInt;
	private String userInputPattern;
	
	public Recursion0()
	{
		nextNum = -1;
		incrementNum = -1;
		sequenceLength = -1;
		userInputPattern = "hello world";
	}
	
	public static void main(String[] args)
	{
		Recursion0 r0 = new Recursion0();
		r0.runIt();
	}
	
	public void runIt()
	{
		int a0 = generateValues();
		sequencePrinter(a0, sequenceLength);
		System.out.println("__");
		
		initInput(3);
		
	}
	
	public void initInput(int runNum)
	{
		if(runNum == 0)
			return;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the next number? ");
		int userGuess = in.nextInt();
		
		if(userGuess != nextNum)
		{
			if(runNum != 1)
				System.out.println("Try again");
			initInput(runNum - 1);
		}
		else
			finalInput();

		
	}
	
	public void finalInput()
	{
		Scanner kb = new Scanner(System.in);	// I avoided using in because I could differentiate them better
		
		System.out.print("What's the pattern? ");
		
		userInputPattern = kb.next();
		
		if(userInputPattern.equalsIgnoreCase("increment") || userInputPattern.equalsIgnoreCase("increase"))
		{
			
			String secondWord = kb.next();
			userInputPattern += secondWord;
			
			if(!(secondWord.equalsIgnoreCase("by")))
			{
				generateErrorResponse();
				return;
			}
				
			userInputInt = kb.nextInt();
			
			if(userInputInt != incrementNum)
			{
				generateErrorResponse();
				return;
			}
		}
		else if(userInputPattern.equalsIgnoreCase("add") || userInputPattern.equalsIgnoreCase("plus"))
		{
			userInputInt = kb.nextInt();
			if(userInputInt != incrementNum)
			{
				generateErrorResponse();
				return;
			}
		}
		else
		{
			generateErrorResponse();
			return;
		}
			
		
		generateCorrectResponse();
	}
	
	public void sequencePrinter(int curNum, int runNum)
	{
		if(runNum == 0)
		{
			return;
		}
		
		System.out.print(curNum);
		System.out.print(", ");
		
		sequencePrinter(curNum + incrementNum, runNum - 1);
	}
	
	public int generateValues()
	{
		incrementNum = (int)(Math.random() * 10) + 1;
		sequenceLength = (int)(Math.random() * 5) + 5;
		
		final int STARTNUM = (int)(Math.random() * 21) - 10;
		
		nextNum = STARTNUM + incrementNum * (sequenceLength);
		
		return STARTNUM;
	}
	
	public void generateErrorResponse()
	{
		System.out.printf("Incorrect. It was not %s%d. It was add %d.", userInputPattern, userInputInt, incrementNum);
	}
	
	public void generateCorrectResponse()
	{
		System.out.printf("Correct. It was add %d.", incrementNum);
	}
}
