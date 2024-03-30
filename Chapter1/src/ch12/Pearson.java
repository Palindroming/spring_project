package ch12;

public class Pearson {

	
	String name;
	int age;
	
	public Pearson() {
		
		
		
		this("이름없음",1);
		// 이 코드 위에코드 삽입 불가;
		//생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전하지 않은 상태이므로 this() statement 이전에 다른 statement를 쓸 수 없음

		
	}
	
	
	public Pearson (String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	
	public Pearson getPerson() {
		return this;
	}
	
	
	public void showPerson() {
		
		System.out.println(name + ","+age);
	}
	
	
	public static void main(String[] args) {
		Pearson person = new Pearson("장세동",32);
		person.showPerson();
		
		
		System.out.println(person);
		Pearson person2 = person.getPerson();
		System.out.println(person2);
		
	}
}
