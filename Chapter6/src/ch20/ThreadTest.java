package ch20;


class Mythread implements Runnable{
	
	public void run() {
		int i;
		for(i=0; i<200; i++) {
			System.out.print(i + "\t");
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread()+ "start");
		
		
		
		
		Mythread runnable = new Mythread();
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();  
		System.out.println(Thread.currentThread()+ "end");
		
		
		

		  
		
	}

}
