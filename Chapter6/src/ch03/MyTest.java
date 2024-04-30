package ch03;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyNumber mn = (x,y) -> x>y? x:y;
		System.out.println(mn.getMax(10, 20));
	}

}
