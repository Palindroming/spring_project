package ch09;

public abstract class Computer { //메서드가 총 4개 
	
	 public abstract void display();
	public abstract void typing();
	 
	
	public void turnOn() {
		
		System.out.println("전원을 킵니다.");
	}
	
	
	public void turnOff() {
		
		System.out.println("전원을 끕니다.");
		
	}

}
