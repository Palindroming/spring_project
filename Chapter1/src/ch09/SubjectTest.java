package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 52);
		studentLee.setMathSubject("수학", 93);
		
		
		Student studentKim = new Student(100, "Kim");
		studentLee.setKoreaSubject("국어", 14);
		studentLee.setMathSubject("수학", 99);
		
		studentLee.showScoreInfo(); 
		studentKim.showScoreInfo();
		
		
		
		
		
	}

}
