package ch21;

public class Book {
	
	private String title;
	private String author;
	
	public Book() {}
	public Book(String title, String author) {
		
		this.title = title;
		this.author = author;
		
	}
/*
 * 이 부분은 제목(title)과 작가(author) 매개변수를 받는 생성자입니다.

하지만 이들은 생성자이지 메소드가 아닙니다. 메소드는 클래스의 행위를 정의하는 반면, 생성자는 객체를 초기화하는 특별한 역할을 합니다.

생성자와 메소드의 주요 차이점은 다음과 같습니다:

생성자는 클래스 이름과 동일하지만, 메소드는 이름이 다릅니다.
생성자는 리턴 타입이 없지만, 메소드는 반드시 리턴 타입이 있습니다.
생성자는 객체 초기화에 사용되지만, 메소드는 객체의 기능을 정의합니다.
생성자는 new 키워드로 호출되지만, 메소드는 객체의 인스턴스 변수로 호출됩니다.
따라서 Book 클래스에는 메소드가 없고, 두 개의 생성자가 정의되어 있습니다. 객체를 생성할 때는 이러한 생성자를 new 키워드와 함께 호출해야 합니다.
 * 
 */
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public void showInfo() {
		System.out.println(title+""+author);
		
	}

}
