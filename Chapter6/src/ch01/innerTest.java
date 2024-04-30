package ch01;

class outClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public outClass(){
		inClass = new InClass();
		
	}
	class InClass{
		
		int inum = 100;
		int snum = 500;
		
		void inTest() {
			System.out.println("outclass instance variable: " +num);
			System.out.println("outclass static variable: " +sNum);
			System.out.println("InClass instance variable: " +inum);
		}
	}
	
	public void UsingClass() {
		
		inClass.inTest();
	}
	
	
	static class InStaticClas{
		
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("InStaticClass inNum = " + inNum);
			System.out.println("InStaticClass sInNum = " + sInNum);
			System.out.println("InStaticClass sNum = " + sNum);
		}
		
		static void sTest() {
//			System.out.println("InStaticClass inNum = " + inNum); static 메서드는 클래스보다 먼저 호출될 수도 있out
			System.out.println("InStaticClass sInNum = " + sInNum);
			System.out.println("InStaticClass sNum = " + sNum);
		}
	}
	
	
}
public class innerTest {
	public static void main(String[] args) {
		outClass oc = new outClass();
		oc.UsingClass();
		
		outClass.InClass inner = oc.new InClass();
		inner.inTest();
		System.out.println("================");
		
		outClass.InStaticClas INS = new outClass.InStaticClas();
		INS.inTest();

		outClass.InStaticClas.sTest(); //정적 메서드는 바로 호출이 가능
	}

}
