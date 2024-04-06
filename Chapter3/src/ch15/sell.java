package ch15;

public interface sell {
	
	void sell();
	
default void order() {
		
		System.out.println("sell order");
		
	}

}
