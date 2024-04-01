package ch21;

public class BookTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5]; //책이 5개 잡히는 것이 아니다.
		/*
		 * Book 클래스 타입의 객체 배열 library를 생성합니다. 배열의 크기는 5입니다.
			이 시점에서는 배열의 각 요소가 null로 초기화됩니다.
		 */
		

		
			library[0] = new Book("태백산맥1","조정");
			library[1] = new Book("태백산맥2","조정");
			library[2] = new Book("태백산맥3","조정");
			library[3] = new Book("태백산맥4","조정");
			library[4] = new Book("태백산맥5","조정");
			
			for(int i = 0; i<library.length; i++) {
				
				System.out.println(library[i]);
			}
			
			for(Book book: library) {
				
				book.showInfo();
			}
			
	}}

//}
//System.out.println(library[i]); 코드에서 객체의 주소값이 출력되는 이유는 Java에서 객체 자체를 직접 출력하려고 하면 해당 객체의 참조값(메모리 주소값)이 출력되기 때문입니다.
//
//Java에서 객체를 문자열로 표현하려면 toString() 메소드를 재정의(override)해야 합니다. Book 클래스에는 toString() 메소드가 재정의되어 있지 않기 때문에 기본적으로 제공되는 toString() 메소드가 호출되어 객체의 메모리 주소값이 출력됩니다.
//
//이를 해결하기 위해서는 Book 클래스에 toString() 메소드를 다음과 같이 재정의해야 합니다.
//
//java
//
//
//Copy code
//@Override
//public String toString() {
//    return "제목: " + title + ", 작가: " + author;
//}
//그러면 System.out.println(library[i]); 코드에서 객체의 메모리 주소값 대신 "제목: 태백산맥1, 작가: 조정래"와 같은 형식으로 출력될 것입니다.
//
//실제로 이 코드에서는 library[i].showBookInfo(); 메소드를 통해 책 정보를 적절하게 출력하고 있기 때문에 toString() 메소드를 재정의할 필요는 없습니다. System.out.println(library[i]);는 단순히 객체의 메모리 주소값을 확인하기 위한 코드일 뿐입니다.
//
//
