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


package ch02;

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
	public String getagentID() {
		
		return agentID;
	}

}
