package ch01;



class Book{
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		
		this.title = title;
		this.author = author;
		
	}

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
	
	
	
}




public class BookTest {

	public static void main(String[] args) {
		
		
		Book book = new Book("Demian", "Hermann Karl Hesse");
		
		System.out.println(book);
		
		String str = new String("test");
		System.out.println(str.toString());
	}

}
