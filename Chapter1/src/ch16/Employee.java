package ch16;

public class Employee {
	
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	
	
	
	
	
	
	
	public static int getSerialNum() {
	
		
		return serialNum;
		
	}













	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	/*Getter-Setter 메소드를 쓰는 이유 : 
	 * 배터리를 사서 -+를 연결해서 교체하고,  점프선을 연결해서 시동을 걸 수 도 있다.

 

즉, 내부의 동작 방법을 안으로 숨기고 사용자에겐 그 부품의 사용법 만을 노출하고 있는 것이다.

 

따라서 객체의 데이터는 함부로 공개하지 않는다.

 

그래서 사용하는것이 getter와 setter이다.

 

getter setter는 객체의 데이터에 직접 접근하지 않고 메소드를 통해 데이터에 접근,변경한다.
	 */

}
