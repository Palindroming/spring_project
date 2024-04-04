package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		
	 ArrayList<Customer> customerList = new ArrayList<>();
	
	 Customer customerT = new Customer(10010, "Tomas");
	 Customer customerb = new Customer(10010, "barrok");
	 Customer customerJ = new GoldCustomer(10010, "James");
	 Customer customerk = new GoldCustomer(10010, "Kotlin");
	 Customer customera = new VIPCustomer(10010, "Aaron");
	 
	 customerList.add(customera);
	 customerList.add(customerb);
	 customerList.add(customerJ);
	 customerList.add(customerk);
	 customerList.add(customerT);
	 
//	 for(Customer c : customerList) {
//		 c.showCustomerInfo();
//		
//	 }
//	 
//	 int price = 10000;
//	 for(Customer customer : customerList) {
//		 
//		 int cost = customer.calcPrice(price);
//		 System.out.println(customer.getCustomerName()+ "님이 "+cost+"원 지불하셨습니다.");
//		 System.out.println(customer.getCustomerName()+ "님의 보너스 포인트는"+ customer.bonusPoint+"입니다.");
//	 }
	 
	if(customera instanceof VIPCustomer) {
	 VIPCustomer vc =(VIPCustomer)customera;
	 customera.showCustomerInfo();
	}
	}

}
