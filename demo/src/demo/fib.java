package demo;

public class fib {
public static void fibo(int n)
{
	int ft=0,st=1;
	System.out.println("fibo series upto"+n+"terms");
	for(int i=1; i<=n;i++)
	{
		System.out.println(ft+",");
		int nt=ft+st;
		ft=st;
		st=nt;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibo(5);

	}

}
