package ch06;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	
//	public String getCustomerGrade() {
//		return customerGrade;
//	}
//
//	public void setCustomerGrade(String customerGrade) {
//		this.customerGrade = customerGrade;
//	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

//	public Customer() {
//		
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		System.out.println("Custoemr Call()");
//		
//	}
	
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		
		bonusPoint += price*bonusRatio;
		return price;
	}  
	
	public void showCustomerInfo() {
		
		System.out.println( customerName + "님의 등급은 "+ customerGrade + "이며 보너스 포인트는 " + bonusPoint + "입니다. ");
	}
	

}
