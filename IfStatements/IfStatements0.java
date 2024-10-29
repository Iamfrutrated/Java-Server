// This program demonstrates the usage and vocab of if else statements. 
// Note that these are the very basics

public class IfStatements0
{
	public static void main(String[] args)
	{
		IfStatements0 is = new IfStatements0();
		
		boolean win = false;
		int score = 0;
		
		// 1 statement can be written like this
		if(win)	// win is expression
			is.printWin();	// printWin() is statement
		else
			is.printLoss();	// printLoss() is statement
		
		// 2 more more statements must be written with the curly braces
		if(win)
		{
			is.printWin();	// statement 1
			score ++;	// statement 2
		}
		else
		{
			is.printLoss();	// statement 1
			score --;		// statement 2
		}
		
		is.printScore(score);
	}

  // ********************************************
  // Anything below here are just different print methods, nothing much to see here

	public void printWin()
	{
		System.out.println("You win!");
	}
	
	public void printLoss()
	{
		System.out.println("You lost :D");
	}
	
	public void printScore(int score)
	{
		System.out.printf("Your score is %d. %n", score);
	}
}
