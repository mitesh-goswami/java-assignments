package demo;

public class PrimeNumberCount {
	public static void primeCount(int count)
	{
		int t;
		for(int i=2; i<=count; i++)
		{
			t=0;
			for( int j=1; j<=i; j++)
			{
				if(i%j==0)
					t++;
				
			}
			if(t==2)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeCount(24);

	}

}
