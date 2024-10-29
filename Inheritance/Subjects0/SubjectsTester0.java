public class SubjectsTester0
{
	// no field variables
	public static void main(String[] args)
	{
		SubjectsTester0 st0 = new SubjectsTester0(); // instantiates an object of itself to call the method.
		
		st0.printNewLines();

		// declaring values to plug into certain classes
		String subjectName = "AP Biology";
		int intelligenceReq = -3;
		boolean rCT = false;
		int newVocabScale = 10000;
		
		// plugging in these values to Subjects0's constructor
		Subjects0 subjects0 = new Subjects0(intelligenceReq, subjectName);
		subjects0.printAction(); // outputting the result from Subjects0

		// plugging in these values to Science0's constructor
		Science0 science0 = new Science0(subjectName, rCT, newVocabScale);
		science0.printAction();	// outputting the result using the method in Subjects0 (passed down to Science0 but then overriden)

		// plugging in these values to Biology0's constructor
		Biology0 biology0 = new Biology0(subjectName, rCT, newVocabScale);
		biology0.printAction();	// outputting the result using the method in Subjects0 (passed down through Science0 all to Biology0)
		
		st0.printNewLines();

		// When outputting, you will notice that the output for the object science0 and the object biology0 are the same.
		// This is not a coincidence, it is because Biology0 used the same printing method (printAction()) that was overriden
		// by Science0 and unchanged in Biology0. Because they used the same printing method and the input values were the same
		// the outputs naturally stayed the same.

		// Even though every method uses the same method "printAction()", as explained above, Science0 overrode the method which
		// resulted in the method name being the same but the actual function being different.
	}
	
	public void printNewLines()
	{
		System.out.println("\n\n");
	}
}
		
