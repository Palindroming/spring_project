package ch15;

public class CustomerTest {
	
	
	
/*
`CustomerTest` 클래스에서 `Customer` 클래스를 상속(`extends`)하는 것과 상속하지 않는 것의 차이는 있습니다.

1. `CustomerTest`가 `Customer`를 상속하지 않는 경우:
   - `CustomerTest`는 `Customer` 클래스와 별개의 독립적인 클래스입니다.
   - `CustomerTest`에서는 `Customer` 클래스의 멤버(메서드와 필드)에 직접 접근할 수 없습니다.
   - `main` 메서드에서 `Customer` 객체를 생성하고 그 객체의 메서드를 호출하는 방식으로만 사용할 수 있습니다.

2. `CustomerTest`가 `Customer`를 상속하는 경우:
   - `CustomerTest`는 `Customer` 클래스를 상속받아 `Customer` 클래스의 모든 멤버(메서드와 필드)를 물려받습니다.
   - `CustomerTest` 클래스 내에서 `Customer` 클래스의 멤버에 직접 접근할 수 있습니다.
   - `main` 메서드에서 `CustomerTest` 객체를 생성하고 그 객체의 메서드를 호출하거나, `Customer` 객체를 생성하고 호출할 수 있습니다.

따라서 `CustomerTest`가 `Customer`를 상속하는 경우, `Customer` 클래스의 모든 기능을 물려받아 활용할 수 있다는 장점이 있습니다. 하지만 상속은 클래스 간의 강한 결합도를 만들어 유지보수성이 떨어질 수 있다는 단점도 있습니다.

`CustomerTest`에서 `Customer`를 상속하지 않더라도, `main` 메서드에서 `Customer` 객체를 생성하고 메서드를 호출하는 방식으로 `Customer` 클래스를 사용할 수 있습니다. 이 경우 `CustomerTest`와 `Customer` 클래스 간의 결합도가 낮아져 유지보수성이 높아집니다.

따라서 상속을 사용할지 여부는 상황에 따라 적절히 판단해야 합니다. 상속이 필요한 경우에는 사용하고, 그렇지 않은 경우에는 객체 생성을 통해 클래스를 사용하는 것이 바람직합니다.
*/	
	public static void main(String[] args) {
		
		Customer a = new Customer();
		
		a.sell();
		a.buy();
		a.order();
		a.hello();
		System.out.println("===================");
		
		buy buyer = a; //업캐스
		
		
		buyer.buy();
		buyer.order();
}
}
