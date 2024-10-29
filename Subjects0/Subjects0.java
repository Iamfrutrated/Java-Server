public class Subjects0
{
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
	
	public void checkGrades()
	{
		System.out.println("You checked your grades.");
	}
	
//	public void setAction()
//	{
//		action = String.format("You studied %s which is a subject that requires an intelligence of %d", subjectName, intelligenceReq);
//	}
	
	public void printAction()
	{
		action = String.format("You studied %s which is a subject that requires an intelligence of %d", subjectName, intelligenceReq);
		System.out.println(action);
	}
}

	
	
