package as2;
/*
 * author: mitesh Goswami
 * version: 1.0
 * organization: stl
 */
public class DateMainSG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDateSG m1= new MyDateSG();
		MyDateSG m2= new MyDateSG(30,03,2000);
		
		m1.printDate();
		m1.setDay(2);
		m1.setMonth(2);
		m1.setYear(2002);
		System.out.println(m1.getDay()+"/"+ m1.getMonth()+"/"+m1.getYear());
		m2.printDate();

	}

}
