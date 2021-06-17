package demo;

public class CharCount {
	public static int countChar(String str, char ch)
	{
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the character appears "+countChar("cristiano ronaldo",'i')+" times");

	}

}
