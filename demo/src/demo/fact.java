package demo;

public class fact {
	public static int factorial(int num)
	{
		if(num<0)
		{
			System.out.println("negative");
			return 0;
		}
		else if(num==0)
			return 1;
		else
		{
			return num*factorial(num-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(3));

	}

}
