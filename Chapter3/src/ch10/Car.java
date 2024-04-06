package ch10;

public abstract class Car {
	
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
		
	}
	
	public void turnOff() {
		System.out.println("시동을 껍니다.");
		
	}
	
	public void washCar() {}
	
	final public void run() { //final: 하위클래스에서 재정의할 수 없다
		
		
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
		
	}

}
