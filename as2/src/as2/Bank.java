package as2;
/*
 * author: mitesh Goswami
 * version: 1.0
 * organization: stl
 */
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("intersest rate:"+Account.getInterest());
		Account.setCount(0);
		//object1
		Account a1=new Account();
		a1.setAccNo(4);
		a1.setBalance(90);
		a1.setownerName("Shawn Mendes");
		a1.setdurationYears(4.0f);
		System.out.println("acc mo:"+a1.getaccNo());
		System.out.println("balance:"+a1.getBalance());
		System.out.println("owner name:"+ a1.getOwnerName());
		System.out.println("years:"+a1.getdurationYears());
		a1.calculateIntrest();
		//object 2
		Account a2= new Account(5,"ed sheeran",9999.00,4.0f);
		a2.printDetails();
		System.out.println("no. of accounts:"+ Account.getCount());

	}

}
