package ch19;

//public class Car {
//    private static int carNum = 10000; // 자동차 번호를 생성하기 위한 정적 변수
//    private int carNumber; // 자동차 번호를 저장할 인스턴스 변수
//
//    public Car() {
//        carNum++; // 자동차 번호 증가
//        carNumber = carNum; // 증가된 번호를 인스턴스 변수에 할당
//    }
//
//    public int getCarNum() {
//        return carNumber; // 자동차 번호 반환
//    }
//}

//public class Car {
//	
//	private static int CarNum = 10000;
//	 
//	
//	public Car () {
//		
//		CarNum++;
//		
//		
//	}
//	
//	public int getCarNum() {
//		
//		return CarNum;
//	}
//	
//	
//	
//}
// 이 코드 삽입 시 결과 : 100002

public class Car {
	
	private static int CarNum = 10000;
	public int CarNumber;
	
	public Car () {
		
		CarNum++;
		CarNumber = CarNum;
		
	}
	
	public int getCarNum() {
		
		return CarNumber;
	}
	
	
	
}
