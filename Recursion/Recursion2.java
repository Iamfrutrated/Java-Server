/*
Problem: "Counting the Steps to One"
Description:
Given a positive integer n, your goal is to reduce n to 1 by following a specific set of transformation rules. For each step, you may:

	Subtract 1 from n, or
	If n is divisible by 3, divide n by 3.
	
Your task is to calculate the minimum number of steps required to reduce n to 1 using these operations.

Input:

	A single integer n (1 ≤ n <= 10^6)
 
Output:

	Print the minimum number of steps required to reduce n to 1.

*/

import java.util.Scanner;

public class Recursion2
{
	private int numTurns;       // inspired by Ploymus1, using the double variable technique to sub in for arrays
	private int minTurns;

  // declare your fields
	public Recursion2()
	{
		numTurns = 0;             
		minTurns = 1;    // know why is 1, there's a reason
	}	

  // normal main stuff
	public static void main(String[] args)
	{
		Recursion2 r2 = new Recursion2();
		r2.runIt();
	}
	
	public void runIt()
	{
		int testNum = getInput();    // get the input
		operate(testNum);            // plug in the input
		System.out.println(minTurns);    // get the corresponding result for the input
	}
	
	public int getInput()
	{
		Scanner in = new Scanner(System.in);    // D&I scanner obj
		int input = in.nextInt();               // getting input
		
		return input;                           // returning input
	}
	
	public void operate(int num)              // most important method
	{	
		if(num == 1)                            // when num is 1, the program terminates
		{
			if(numTurns > minTurns)               // importance is 
				minTurns = numTurns;                // key to understand
			
			numTurns = 0;                         // know why to reset it
			return;
		}
		// this is the only part that requires brain cells to comprehend
		if(num % 3 == 0)                        
			operate(num/3);
			
		operate(num - 1);
    // up to here
		numTurns ++;                            // unless u wanna mess with extra evaluations and if statements, understand thsi
	}
}
