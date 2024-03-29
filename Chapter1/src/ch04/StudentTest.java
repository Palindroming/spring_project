package ch04;

public class StudentTest {
	
	public static void main (String[] args) {
	
	Student studentLee = new Student();
	//인스턴스 생성
	
	studentLee.studentID = 12345;
	studentLee.setStudentName("Lee");
	studentLee.address = "서울 강남구";
	
	studentLee.showStudentINfo();
	
	
	Student studentKim = new Student();
	studentKim.studentID = 54321;
	studentKim.studentName = "Kim";
	studentKim.address = "경기도 성남시";
	
	studentKim.showStudentINfo();
	System.out.println(studentKim);
	System.out.println(studentLee);
/*주소 출력, 실제 주소가 아닌 ,JVM이 준 가상 주소 */
	
	}
	
}
  