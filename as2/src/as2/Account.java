package as2;
/*
 * author: mitesh Goswami
 * version: 1.0
 * organization: stl
 */
public class Account {
	//private data members
	private int accNo;
	private String ownerName;
	private double balance;
	private float durationYears;
	//static data members
	private static float interestRate;
	private static int count;
	static {
		interestRate=0.05f;
		//System.out.println("static block");
	}
	// default constructor
	public Account()
	{
		accNo=1;
		ownerName="ed sheeran";
		balance=900000.00;
		durationYears=4.0f;
		count++;
	}
	//parametrized constructor
	public Account(int accNo,String ownerName,double balance,float years)
	{
		this.accNo=accNo;
		this.ownerName=ownerName;
		this.balance=balance;
		durationYears=years;
		count++;
	}
	// getters and setters
	public void setAccNo(int accNo)
	{
		this.accNo=accNo;
	}
	public void setownerName(String ownerName)
	{
		this.ownerName=ownerName;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public void setdurationYears(float years)
	{
		durationYears=years;
	}
	public int getaccNo()
	{
		return accNo;
	}
	public String getOwnerName()
	{
		return ownerName;
	}
	public double getBalance()
	{
		return balance;
	}
	public float getdurationYears()
	{
		return durationYears;
	}
	public static void setInterest(float in)
	{
		interestRate=in;
	}
	public static float getInterest()
	{
		return interestRate;
	}
	public static void setCount(int c)
	{
		count=c;
	}
	public static int getCount()
	{
		return count;
	}
	public void calculateIntrest()
	{
		System.out.println("intrest amount:"+ balance*interestRate*durationYears);
	}
	// printing details
	public void printDetails()
	{
		System.out.println("account number:"+accNo);
		System.out.println("owner name:"+ownerName);
		System.out.println("Balance:"+balance+" duration years:"+ durationYears);
		System.out.println("intrest amount:"+ balance*interestRate*durationYears);
	}
	

}
