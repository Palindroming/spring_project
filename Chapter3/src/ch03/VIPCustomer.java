//package ch02;
//
//public class VIPCustomer extends Customer{
//	
//
//	
//	double salesRatio;
//	String agentID;
//	
//	 
//	public VIPCustomer() {
//		
//		setCustomerGrade("VIP");
//		salesRatio = 0.1;
//		bonusRatio = 0.05;
//		
//	}
//
//}
//
//


package ch03;

public class VIPCustomer extends Customer{
	

	
	double salesRatio;
	private String agentID;
	
	 
//	public VIPCustomer() {
//		
//		//super(); -> 생성자를 호출하는 코드가 하나도 없으면 super 키워드를 자연적으로 넣어  
//		
//		customerGrade = "VIP";
//		salesRatio = 0.1;
//		bonusRatio = 0.05;
//		
//		System.out.println("VIPCustomer() call");
//	}
//	
	
	
	
	public VIPCustomer(int customerID, String customerName) {
		
		super(customerID, customerName);
		customerGrade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
		
		
		
		
	}
	@Override //anotation: 컴파일러에 특별한 정보를 제공해 주는 역할 
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		price -= (int)(price*salesRatio); // 소수점일 수도 있기 때문 
		return price;
		
	}
	public String getagentID() {
		
		return agentID;
	}

}
