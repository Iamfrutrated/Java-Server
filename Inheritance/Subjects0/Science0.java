public class Science0 extends Subjects0	// Science can use all the methods and all the field variables(protected) from Subjects0
{
	protected String fieldName;	// These variables can be passed on to subclasses (Biology0)
	protected boolean needsCriticalThinking;	
	protected int newVocabScale; // 1 - 100 
	
	public Science0(String fieldNameIn, boolean nCTIn, int newVocabScaleIn)	// constructor for Science0 with values
										// because Biology0 passes values into this constructor
										// the values passed in from Biology0 will directly
										// affect the values here.
	{
		// These simply assign values passed in from Biology0 into this constructor to the field variables
		
		fieldName = fieldNameIn;	
		needsCriticalThinking = nCTIn;
		newVocabScale = newVocabScaleIn;
	}
	
	public void printAction()	// print method
	{
		if(needsCriticalThinking)
		{
			System.out.printf("You studied %s which requires critical thinking, needs an intelligence of %d, and has rating of %d for new vocab %n", 
								fieldName, intelligenceReq, newVocabScale);
		}
		else
		{
			System.out.printf("You studied %s which does not require critical thinking, needs an intelligence of %d, and has a rating of %d for new vocab %n",
								fieldName, intelligenceReq, newVocabScale);
		}
	}					
	
}
