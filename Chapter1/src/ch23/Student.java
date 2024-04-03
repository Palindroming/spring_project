package ch23;


import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
/*
 * 이 코드는 Subject 타입의 요소를 가지는 ArrayList 객체를 참조할 변수 subjectList를 선언하는 코드입니다. 생성자가 아니라 변수 선언입니다.

자세히 설명하면:

ArrayList는 Java 컬렉션 프레임워크에서 제공하는 동적 배열 클래스입니다.
<Subject>는 제네릭 타입 파라미터로, ArrayList에 저장될 요소의 타입을 지정합니다. 여기서는 Subject 타입의 객체만 저장할 수 있습니다.
subjectList는 변수 이름입니다. 이 변수를 통해 ArrayList 객체를 참조할 수 있습니다.
;는 문장의 끝을 나타냅니다.
따라서 이 코드는 Subject 타입의 요소를 가지는 ArrayList 객체를 참조할 변수를 선언하는 것입니다. 실제 ArrayList 객체는 생성되지 않았습니다. 객체를 생성하려면 다음과 같이 해야 합니다:
 */
	
	
/*
 * int i; // 메모리 공간을 할당하지만 객체를 생성하지는 않습니다.
ArrayList<Subject> subjectList; // 아직 객체가 생성되지 않았습니다.
기본 데이터 타입과 객체 모두 변수 선언 시에는 메모리 공간만 할당되고 실제 값이나 객체는 생성되지 않습니다. 그러나 기본 데이터 타입의 경우에는 변수에 직접 값을 할당할 수 있습니다.

java


Copy code
int i = 10; // 이제 i에 10이라는 값이 저장됩니다.
객체의 경우에는 변수에 직접 객체를 할당할 수 없습니다. 대신 별도로 객체를 생성한 후 그 메모리 주소를 변수에 저장해야 합니다.

java


Copy code
ArrayList<Subject> subjectList = new ArrayList<>(); // 새로운 ArrayList 객체를 생성하고 그 주소를 subjectList에 저장합니다.
따라서 int i;는 단순히 메모리 공간을 할당하는 것이며, 실제로 객체를 생성하지는 않습니다. 객체는 new 연산자를 사용하여 별도로 생성해야 합니다.
 */

// 기본 데이터 타입(primitive type) : int , double, boolean // 실제 값을 저장하기 위한 메모리 공간 할당 
// 참조 데이터 타입(reference type) : 객체  // 변수는 객체 자체가 아닌 객체의 메모리 주소 할당 

	
	Student(int studentID, String studentName){
		
		this.studentID =studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();

	}
/*해당 코드는 생성자(constructor)의 정의부분입니다. 생성자는 클래스의 인스턴스(객체)를 생성할 때 호출되며, 객체의 초기화 작업을 수행합니다.

생성자는 다음과 같은 특징이 있습니다:

생성자의 이름은 클래스 이름과 동일해야 합니다.
리턴 타입을 정의하지 않습니다. (void도 적지 않습니다)
생성자 오버로딩을 통해 다양한 매개변수 조합으로 정의할 수 있습니다.
따라서 주어진 코드에서는 public 같은 접근 제어자나 void와 같은 리턴 타입을 명시하지 않아도 됩니다.

전체 코드를 예상해보면 다음과 같습니다:

public class Student {
    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjectList;

    // 생성자
    Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<>();
    }

    // 다른 메서드들...
}
생성자 코드 Student(int studentID, String studentName) 에서는 접근 제어자와 리턴 타입을 명시하지 않고, 단순히 생성자 이름과 매개변수 부분만 작성합니다. 이렇게 작성된 생성자는 Student 클래스의 인스턴스를 생성할 때 호출되어 해당 인스턴스를 초기화합니다.





*/
	public void addSubject(String name, int point) {
		
		
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(point);
		
		subjectList.add(subject);
		
	
	}
	public void showStudentInfo() {
		
		int total = 0;
		
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			System.out.println(studentName + "학생의 "+ subject.getName() + "과목의 성적은 "+ subject.getScorePoint()+ "입니다.");
			
	}

}
}
