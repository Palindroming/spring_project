package ch10;

public class CarTest {

	public static void main(String[] args) {
		
		Car aiCar = new AICar(); //추상 메서드는 
		aiCar.run();
		
		System.out.println("============================");
		Car mCar = new ManualCar();
		mCar.run();

	}

}
