package as2;
/*
 * author: mitesh Goswami
 * version: 1.0
 * organization: stl
 */
public class MyDateT {
	private int day,month,year;
	public MyDateT()
	{
		day=12;
		month=11;
		year=2020;
	}
	public MyDateT(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void printDate()
	{
		System.out.println(day+"/"+ month+"/"+year);
	}

}
