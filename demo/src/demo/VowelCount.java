package demo;
import java.util.Scanner;
public class VowelCount {
	public static int countVowels(String str)
	{
		int count = 0;
		for (int i=0 ; i<str.length(); i++){
	         char ch = str.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u')
	            count ++;
	         
	      }
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a sentence :");
	      Scanner sc = new Scanner(System.in);
	      String s = sc.nextLine();
	      System.out.println(countVowels(s));
	      sc.close();

	}

}
