public class Science0 extends Subjects0
{
	protected String fieldName;
	protected boolean needsCriticalThinking;
	protected int newVocabScale; // 1 - 100 
	
	public Science0(String fieldNameIn, boolean nCTIn, int newVocabScaleIn)
	{
		fieldName = fieldNameIn;
		needsCriticalThinking = nCTIn;
		newVocabScale = newVocabScaleIn;
	}
	
	public void printAction()
	{
		if(needsCriticalThinking) // not officially taught yet
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
