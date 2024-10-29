public class SubjectsTester0
{
	public static void main(String[] args)
	{
		SubjectsTester0 st0 = new SubjectsTester0();
		
		st0.printNewLines();
		
		String subjectName = "AP Biology";
		int intelligenceReq = -3;
		boolean rCT = false;
		int newVocabScale = 10000;
		
		
		Subjects0 subjects0 = new Subjects0(intelligenceReq, subjectName);
		subjects0.printAction();
		
		Science0 science0 = new Science0(subjectName, rCT, newVocabScale);
		science0.printAction();
		
		Biology0 biology0 = new Biology0(subjectName, rCT, newVocabScale);
		biology0.printAction();
		
		st0.printNewLines();
	}
	
	public void printNewLines()
	{
		System.out.println("\n\n");
	}
}
		
