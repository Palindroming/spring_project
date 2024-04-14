package Ch05;

/*
 * 
 * 이 두 줄의 코드는 서로 다른 의미를 가지고 있습니다.

Powder powder;
이 코드는 단순히 Powder 클래스 타입의 참조 변수 powder를 선언하는 것입니다.
이 시점에서는 powder 변수에 실제 객체가 할당되지 않았습니다. 즉, powder는 null 값을 가지고 있습니다.
Powder powder = new Powder();
이 코드는 Powder 클래스의 인스턴스(객체)를 생성하고, 그 객체의 참조를 powder 변수에 할당합니다.
new Powder()는 Powder 클래스의 생성자를 호출하여 새로운 객체를 만듭니다.
이 시점에서 powder 변수는 유효한 Powder 객체를 참조하게 됩니다.
이 두 코드의 차이를 예시로 설명하면 다음과 같습니다:
 */

public class ThreeDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Powder powder = new Powder();
		
		
		ThreeDPrinter2 printer = new ThreeDPrinter2();
		
		
		
		printer.setMaterial(powder);
		 
		Powder p = (Powder)printer.getMaterial();
		
		System.out.println(p);
	}

}
