package demo;

public class oop {
	private int cid,age,pinCode;
	private String name,city;
	oop()
	{
		this.cid =0;
		this.age=0;
		this.pinCode=0;
		this.name="a";
		this.city="a";
	}
	oop(int cid,int age, int pinCode,String name,String City)
	{
		this.cid =cid;
		this.age=age;
		this.pinCode=pinCode;
		this.name=name;
		this.city=City;

	}
	public void setName(String n)
	{
		this.name=n;
	}
	public String getName()
	{
		return this.name;
	}
	public void printDetails()
	{
		System.out.println(this.cid);
		System.out.println(this.age);
		System.out.println(this.pinCode);
		System.out.println(this.name);
		System.out.println(this.city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oop n=new oop(2,19,28,"darth","vader");
		n.setName("sheldon");
		n.getName();
		n.printDetails();

	}

}
