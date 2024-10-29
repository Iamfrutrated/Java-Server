public class Mathematics0 extends Subjects0
{
	protected String fieldName; //name of the mathematical field (ex: Algebra, Geometry)
	
	public Mathematics0()
	{
		// no-args constructor
	}
	
	public Mathematics0(String fieldNameIn, int intelligenceIn)
	{
		super(intelligenceIn, fieldNameIn);
	}
	
	public void problem()
	{
		System.out.println("compute 1+1");
	}
	
	public void study()
	{
		System.out.println("You studied math");
	}
	
}
