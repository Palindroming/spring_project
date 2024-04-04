package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010,"이순신");
	
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPCustomer Kim = new VIPCustomer(10020,"김유신");

		Kim.bonusPoint = 10000;
		System.out.println(Kim.showCustomerInfo());
		
		
		Customer vc = new VIPCustomer(12345,"noname"); 
		// 인스턴스는 VIPCustomer로 만들어졌으나 type 이 Customer
		// Customer 내 함수밖에 쓸 수 없다 VIP x 
		
	
		
	
	}

}
