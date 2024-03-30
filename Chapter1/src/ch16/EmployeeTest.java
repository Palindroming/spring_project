package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		System.out.println(employeeLee.serialNum);
		
		Employee employeeKee = new Employee();
		employeeKee.setEmployeeName("기진호");
	
		
		System.out.println(employeeKee.serialNum);
		System.out.println(employeeLee.serialNum); 
		/* 기진호 시리얼 넘이나 이순신 시리얼 넘이나 같은 시리얼넘버를 공유 >>어디서 증가시켜도 상관없음 */
		/* 변수가 인스턴스끼 공유 */

	}

}

