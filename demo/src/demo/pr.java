package demo;

public class pr {
	public static String prime(int num)
	{
		boolean flag =false;
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
			return(num+ "is prime");
		else
			return(num+ " not prime");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prime(10));
	}

}
