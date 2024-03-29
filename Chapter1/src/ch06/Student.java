package ch06;

public class Student {
	
	
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	/*


**public** **int** studentNumber;
**public** String studentName; 
**public** **int** grade;

이 부분은 클래스의 멤버 변수(인스턴스 변수)를 선언하는 부분입니다. 만약 이 부분을 정의하지 않으면 다음과 같은 문제가 발생할 수 있습니다.

1. 생성자에서 this.studentNumber, this.studentName, this.grade를 할당할 때 에러가 납니다. 클래스에 해당 변수가 정의되어 있지 않기 때문입니다.

2. showStudentInfo() 메서드에서 studentNumber, studentName, grade 변수를 참조할 때 에러가 납니다. 마찬가지로 해당 변수가 정의되어 있지 않아 컴파일 에러가 발생합니다.

3. 객체 생성 후 studentNumber, studentName, grade 변수에 값을 할당하거나 읽을 수 없습니다. 변수 자체가 존재하지 않기 때문입니다.

결과적으로 학생 정보를 저장하고 조회할 수 있는 기능 자체가 작동하지 않게 됩니다. 클래스의 상태(state)를 저장하기 위한 멤버 변수가 없기 때문입니다. 따라서 이 변수들의 정의는 필수적입니다.
	 */
	
	public Student() {}
	
	public Student(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		
		return studentName + "학생의 학번은 "+ studentNumber + "이고, "+grade + "학년입니다";
		
			
	}

}
