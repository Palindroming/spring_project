

package ch19;


public class CarFactoryTest{
	
	public static void main(String [] args) {
		
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
		
	}
}

//public class CarFactoryTest {
//
//	public static void main(String[] args) {
//		CarFactory factory = CarFactory.getInstance();
//		Car mySonata = factory.createCar();
//		Car yourSonata = factory.createCar();
//		
//		System.out.println(mySonata.getCarNum());     //10001 출력
//		System.out.println(yourSonata.getCarNum());   //10002 출력
//	}
//}
/*
제공해주신 코드에서 System.out.println(mySonata.getCarNum());과 System.out.println(yourSonata.getCarNum());를 호출하면 각각 10001과 10002가 출력될 것입니다.

Car 클래스에서 carNum이라는 정적 변수를 사용하여 자동차 번호를 생성합니다. 처음에는 10000으로 초기화되고, 새로운 Car 객체가 생성될 때마다 1씩 증가합니다. 이 값은 Car 객체의 carNumber 인스턴스 변수에 저장되고, getCarNum() 메서드를 통해 반환됩니다.

CarFactory 클래스는 싱글톤 패턴으로 구현되어 있으며, createCar() 메서드를 호출하면 새로운 Car 객체를 생성하고 반환합니다.

한 줄 설명:

Car 클래스: 자동차 객체를 표현하며, 고유한 자동차 번호를 생성하고 반환합니다.
CarFactory 클래스: 싱글톤 패턴을 적용하여 Car 객체를 생성하는 팩토리 클래스입니다.
*/