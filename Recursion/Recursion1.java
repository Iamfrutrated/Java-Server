// https://open.kattis.com/problems/goldbach2 		Good example for recursion

import java.util.Scanner;

public class Recursion1
{
	private int numWays;
	
	public Recursion1()
	{
		numWays = 0;
	}
	
	public static void main(String[] args)
	{
		Recursion1 r1 = new Recursion1();
		r1.runIt();
	}
	
	public void runIt()
	{
		int numInputs = getInput();
		
		for(int i = 0; i < numInputs; i ++)
		{
			numWays = 0;
			int originalNum;
			originalNum = getInput();
			operate(2, 2, originalNum);
			System.out.print("Number of ways this number can be split into two primes: ");
			System.out.println(numWays);
		}
		
		
	}
			
			
	
	public int getInput()
	{
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		
		return input;
	}
	
	public void operate(int testNum1, int testNum2, int num)
	{
		Scanner in = new Scanner(System.in);
		
		// --------------------------------------------------------------------------------------------------------------------------------
		
		// System.out.printf("%d, %d %n", testNum1, testNum2);
		// in.nextLine();
		
		// --------------------------------------------------------------------------------------------------------------------------------
		boolean tN1check = primeChecker(2, testNum1);
		boolean tN2check = primeChecker(2, testNum2);
		
		
		
		if(testNum1 > num/2)
			return;
		
			
		if(testNum1 + testNum2 > num)
		{
			operate(testNum1 + 1, 2, num);
			return;
		}
		
		if(tN1check && tN2check && testNum1 + testNum2 == num)
		{	
			printSuccess(testNum1, testNum2);
			operate(testNum1 + 1, 2, num);
			numWays ++;
			return;
		}
		
		if(tN1check)
			operate(testNum1, testNum2 + 1, num);
		else
			operate(testNum1 + 1, testNum2, num);
	}
	
	public boolean primeChecker(int testNum, int num)
	{
		if(num == 1)
			return false;
			
		if(num == 2 || num == 3)
			return true;
			
		if(num % testNum == 0)
			return false;
		
		if(testNum == num/3)
			return true;
		
		return primeChecker(testNum + 1, num);
	}
	
	public void printSuccess(int prime1, int prime2)
	{
		System.out.printf("%d + %d %n", prime1, prime2);
	}
}
