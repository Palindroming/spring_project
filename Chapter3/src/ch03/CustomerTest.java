package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010,"이순신");
	
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo()+price);
		
		
		VIPCustomer Kim = new VIPCustomer(10020,"김유신");

		Kim.bonusPoint = 10000;
		price = Kim.calcPrice(1000);
		System.out.println(Kim.showCustomerInfo()+ price);
		
		
		Customer vc = new VIPCustomer(12345,"noname"); 
		price = vc.calcPrice(1000); // 
		System.out.println(price);
		// 인스턴스는 VIPCustomer로 만들어졌으나 type 이 Customer
		// Customer 내 변수밖에 쓸 수 없다 VIP x 
		// 자바에서는 항상 인스턴스의 메서드가 호출 됨 
		
	
		
	
	}

}

/*
이 코드에서 vc.salesRatio를 사용할 수 없는 이유와 vc.calcPrice(1000) 결과가 900인 이유는 다음과 같습니다.

vc의 실제 인스턴스는 VIPCustomer이지만, 참조 변수의 타입은 Customer입니다. 자바에서는 참조 변수의 타입에 따라 접근 가능한 멤버(필드, 메서드)가 결정됩니다. 따라서 vc는 Customer 클래스의 멤버만 접근할 수 있고, VIPCustomer의 salesRatio 필드에 접근할 수 없습니다.
vc.calcPrice(1000)의 결과가 900인 이유는 VIPCustomer의 calcPrice 메서드가 실행되었기 때문입니다. 이는 자바의 '가상 메서드 호출(Virtual Method Invocation)' 원리 때문입니다.
자바에서는 참조 변수의 타입이 아닌 실제 인스턴스의 메서드가 호출됩니다.
vc의 실제 인스턴스는 VIPCustomer이므로, VIPCustomer의 calcPrice 메서드가 호출되었습니다.
VIPCustomer의 calcPrice 메서드는 가격에서 salesRatio(0.1)를 할인한 값을 반환하므로, 1000원에 대해 900원을 반환합니다.
따라서 vc는 Customer 타입의 참조 변수이므로 VIPCustomer의 salesRatio 필드에는 접근할 수 없지만, 실제 인스턴스가 VIPCustomer이므로 VIPCustomer의 calcPrice 메서드가 호출되어 할인된 가격 900원이 출력됩니다.

이렇게 상속 관계에서 참조 변수의 타입과 실제 인스턴스의 타입이 다를 경우, 접근 가능한 멤버는 참조 변수의 타입에 따르지만 메서드 호출은 실제 인스턴스의 메서드가 호출되는 것이 자바의 원리입니다.
*/