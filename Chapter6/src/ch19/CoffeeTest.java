package ch19;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee etc = new EtiopiaAmericano();
		
		
		
		
		etc.brewing();
		System.out.println();
		Coffee etl = new Latte(etc);
		etl.brewing();
		
		System.out.println();
		
		Coffee mochaetiopia = new Mocha(new Latte(new EtiopiaAmericano()));
		
		mochaetiopia.brewing();
		
		
		Coffee Kc = new WhippingCream(new Mocha (new KenyaAmericano()));		
		
		Kc.brewing();
	}

}
