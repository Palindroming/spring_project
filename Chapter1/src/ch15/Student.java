package ch15;

public class Student {
	
	String studentName;
	int money;

	
	
	
	public Student(String studentName, int money) {
		
		this.studentName = studentName;
		this.money = money;
		
	}
	
	public void takeTaxi(Taxi taxi, int fee) {
		
		this.money -= fee;
		taxi.money += fee;
	
		
		
	}
	
	
	public void StudentInfo() {
		
		System.out.println(studentName+ "님의 남은 돈은 "+ money + "원 입니다.");
	}
	
}
