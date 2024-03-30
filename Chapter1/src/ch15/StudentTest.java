package ch15;

public class StudentTest {

	public static void main(String[] args) {
		
		
		Student E = new Student("Edward",52000);
		Taxi taxi1 = new Taxi("잘나간다 운수", 8000);
		E.takeTaxi(taxi1,10000);
		E.StudentInfo();
		taxi1.showTaxiinfo();
		

	}

}
