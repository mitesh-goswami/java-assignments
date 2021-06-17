package demo;

public class arm {
	public static void armstrong(int n)
	{
		int n1,r,result=0;
		n1=n;
		while(n1!=0)
		{
			r=n1%10;
			result+=Math.pow(r, 3);
			n1/=10;
		}
		if(result==n)
			System.out.println(n+"is armstrong");
		else
			System.out.println(n+" not armstrong");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrong(153);

	}

}
