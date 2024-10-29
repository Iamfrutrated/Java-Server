public class Subjects0	// main class
{
	// These variables can be passed down to derived/sub classes (Science0)
	protected int intelligenceReq; // scale between 1 - 100
	protected int intuitionMeter; // scale between 1 - 100
	protected String subjectName; 
	
	protected String action;
	
	public Subjects0() // no-args constructor
	{
		intelligenceReq = -1;
		subjectName = "class";
	}
	
	public Subjects0(int intelligenceReqIn, String subjectNameIn)
	{
		intelligenceReq = intelligenceReqIn;
		subjectName = subjectNameIn;
	}

	// This method will be passed down to derived/sub classes (Science0)
	public void checkGrades()
	{
		System.out.println("You checked your grades.");
	}

	// This block is not needed and will change how the code is written
//	public void setAction()
//	{
//		action = String.format("You studied %s which is a subject that requires an intelligence of %d", subjectName, intelligenceReq);
//	}

	// Takes the values inputted through the constructor from Science0 (which got those values from Biology0), and formats a
	// list to print it out.
	public void printAction()
	{
		action = String.format("You studied %s which is a subject that requires an intelligence of %d", subjectName, intelligenceReq);
		System.out.println(action);
	}
}

	
	
