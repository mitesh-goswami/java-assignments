package demo;
import java.util.Scanner;

public class MultiplicationTable {
	public static void mulTable(int n)
	{
		for(int i=1; i<=10; i++)
			System.out.println(n+" * "+i+" = "+n*i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		mulTable(n);
		s.close();
		

	}

}
