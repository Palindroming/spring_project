package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library = new Book[5]; //책이 5개 잡히는 것이 아니다.
		Book[] copyLibrary = new Book[5];
		/*
		 * Book 클래스 타입의 객체 배열 library를 생성합니다. 배열의 크기는 5입니다.
			이 시점에서는 배열의 각 요소가 null로 초기화됩니다.
		 */
		

		
			library[0] = new Book("태백산맥1","조정");
			library[1] = new Book("태백산맥2","조정");
			library[2] = new Book("태백산맥3","조정");
			library[3] = new Book("태백산맥4","조정");
			library[4] = new Book("태백산맥5","조정");
			
			
			System.arraycopy(library, 0, copyLibrary, 0, 5); 
			
			for(int i = 0; i<library.length; i++) {
				
				System.out.println(library[i]);
			}
			
			for(Book book: copyLibrary) {
				System.out.println(book);
				book.showInfo();
			}
			
	}
	

	
	}

