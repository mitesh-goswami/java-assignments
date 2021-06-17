package demo;

public class ArmstrongNumberCount {
	public static void armstrongCount(int count)
	{
		int n,t=0,b,sum=0;
		System.out.println("armstrong number upto:"+ count);
		for(int i=1; i<=count; i++)
		{
			n=i;
			t=n;
			while(t!=0)
			{
				b=t%10;
				sum +=(b*b*b);
				t= t/10;
			}
			if(sum == n)
			{
				System.out.println(n);
			}
			sum=0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrongCount(250);

	}

}
