package ch15;

public interface buy {
	
	void buy();
	
	default void order() {
		
		System.out.println("buy order");
		
	}

}
