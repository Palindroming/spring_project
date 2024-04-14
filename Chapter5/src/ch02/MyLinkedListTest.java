package ch02;

public class MyLinkedListTest {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		
		list.addElement("a");
		list.addElement("b");
		list.addElement("c");
		list.addElement("d");
		list.printAll();
		list.removeElement(2);
		list.printAll();

	}

}
 