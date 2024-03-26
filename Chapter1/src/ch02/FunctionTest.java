/* 함수란? 하나의 기능을 수행하는 일련의 코드
 * 스택: 함수가 호출될 때 지역 변수들이 사용하는 메모
 * 메서드: 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수 
 * 	멤버 함수라고도 함
 * 
 * 
 */






package ch02;

public class FunctionTest {
	
	
	public static int addNum(int num1, int num2) {
		
		int result;
		result = num1 + num2;
		return result;
		
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		
		
		int sum = 0;
		int i;
		
		for (i=0; i<=100; i++) {
			
			sum += i;
		}
		return sum;
	}

	
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		int total = addNum(n1, n2);
		System.out.println(total);
		
	    sayHello("안녕하세요");
	    System.out.println(total);
		
		
	}
}


