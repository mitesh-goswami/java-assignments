package as2;
/*
 * author: mitesh Goswami
 * version: 1.0
 * organization: stl
 */
public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathEngine m1= new MathEngine();
		System.out.println(m1.multiply(2,4));
		m1.multiply(9, 8, 9);
		System.out.println(m1.multiply(2.0f,4));
		System.out.println(m1.multiply(2,5.01f));
		

	}

}
