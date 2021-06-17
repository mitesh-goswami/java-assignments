package demo;

import java.util.Scanner;

public class Palindrome {
	public static boolean checkPalindrome(String str)
	{
		int i = 0, j = str.length() - 1;
		 
        
        while (i < j) {
 
            
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            
            i++;
            j--;
        }
 
        
        return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a sentence :");
	      Scanner sc = new Scanner(System.in);
	      String s = sc.nextLine();
	      if (checkPalindrome(s))
	            System.out.print("Yes it is palimdrome");
	        else
	            System.out.print("No it's not");
	      sc.close();

	}

}
