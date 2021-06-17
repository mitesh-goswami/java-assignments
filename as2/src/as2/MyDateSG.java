package as2;
/*
 * author: mitesh Goswami
 * version: 1.0
 * organization: stl
 */
public class MyDateSG {
	private int day,month,year;
	public MyDateSG()
	{
		day=12;
		month=11;
		year=2020;
	}
	public MyDateSG(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void setDay(int day)
	{
		this.day=day;
	}
	public int getDay()
	{
		return day;
	}
	public void setMonth(int month)
	{
		this.month = month;
	}
	public int getMonth()
	{
		return month;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getYear()
	{
		return year;
	}
	public void printDate()
	{
		System.out.println(day+"/"+ month+"/"+year);
	}

}
