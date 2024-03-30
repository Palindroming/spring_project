package ch13;

public class StudentTest {

	public static void main(String[] args) {
		
		Bus bus = new Bus(1000);
		Subway subway = new Subway(2);
		Student James = new Student("James",5000);
		James.takeBus(bus);
	
		Student Tomas = new Student("Tomas",10000);
		Tomas.takeSubway(subway);
		
		James.showInfo();
		Tomas.showInfo();
		
		bus.showBusinfo();
		subway.showSubwayinfo();

	}

}

/* 객체지향 프로그래밍으로 코딩을 할 때 각 객체에 대한 협력이 이루어진다 */