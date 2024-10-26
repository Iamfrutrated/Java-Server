public class StaffTester0
{
	private float money;
	private float income;
	
	public StaffTester0()
	{
		money = -1;
		income = -1;
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		MinimumWageWorker0 mww = new MinimumWageWorker0();
		StaffTester0 st0 = new StaffTester0();
		
		// money = mww.money;
		// income = mww.income;
	
		st0.money = mww.money;
		st0.income = mww.income;
		
		
		st0.printProfile();
	}
	public void printProfile()
	{
		System.out.printf("You are a minimum wage worker with an income of %.2f and a balance of %.2f", income, money);
	}
	
}
		

