package ch04;

public class Person {
	private String name;
	private int age;
	
	public Person() {} //중괄호 없이 생성자를 선언하면 컴파일 에러가 남
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
