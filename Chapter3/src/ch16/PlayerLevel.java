package ch16;

public  abstract class PlayerLevel {
	
	int count; 
	
	abstract void run();
	 void jump() {
	}
	 void turn() {
	}
	 void showLevelMessage() {
	}
	 
	/*
	 * abstract void run();
	abstract void jump();
	abstract void turn();
	abstract void showLevelMessage();도 상관없
	 */
	 final public void go(int count) {
		
		run();
		for(int i = 0; i< count; i++)
		{
			jump();
		}
		turn();
	 }
	
	
}
