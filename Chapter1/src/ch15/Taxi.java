package ch15;

public class Taxi {
	
	String companyName;
	int money ;
	
	public Taxi(String companyName, int money) {
		
		this.companyName = companyName;
		this.money = money;
		
	

		
		
	}
	
	public void showTaxiinfo() {
		
		System.out.println(companyName + "택시 수입은 " + money + "원 입니다.");
		
	}

}
