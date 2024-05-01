package ch08;

public class Customer {

	private String name;
	private int age;
	private int price;
	
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Customer(String name, int age, int price) { //객체 초기화
		
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	
}