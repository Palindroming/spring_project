package ch15;

public class Customer implements buy, sell{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("customer buy");
		 
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		//ch15.sell.super.order();
		//ch15.buy.super.order();
		System.out.println("custmer order");
		
	}
	
	public void hello() {
		
		System.out.println("hello");
		
	}
	
	
	

}
