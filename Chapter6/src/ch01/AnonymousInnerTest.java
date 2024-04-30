package ch01;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	Runnable getRunnable(int i) { //Runnable이라는 인터페이스를 반환한다.
		
		int num = 100;
		
		return new Runnable(){
			int localNum = 10;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("i = " + i); 
			System.out.println("num  = " + num); //외부 클래스 인스턴스 변수
			System.out.println("localNum = " + localNum); //외부 클래스 정적변수

			
		}
			
			
		};
		
	
		
	}
	
	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			System.out.println("runnable class ");
		}
		

	};
	
}
public class AnonymousInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(1);
		runner.run();
		System.out.println("===============");
		out.getRunnable(4).run();
		
		out.runnable.run();
	}

}
