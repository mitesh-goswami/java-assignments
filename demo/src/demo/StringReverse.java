package demo;

public class StringReverse {
	public static String reverse(String str)
	{
		String r="";
		int length = str.length();
		for(int i = length-1; i>=0;i--)
			r= r + str.charAt(i);
		return ("Reverse of string: "+ r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("darth vader"));

	}

}
