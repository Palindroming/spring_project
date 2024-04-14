package ch02;

public class MyLinkedList {
	
	private MyListNode head;
	int count;
	
	public MyLinkedList() {
		head = null;
		count = 0;
	}
	
	public MyListNode addElement( String data )
	{
		
		MyListNode newNode;
		if(head == null){  //맨 처음일때
			newNode = new MyListNode(data);
			head = newNode;
		}
		else{
			newNode = new MyListNode(data);
			MyListNode temp = head;
			while(temp.next != null)  //맨 뒤로 가서  
				temp = temp.next;
			temp.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data) {
		int i;
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);
		
		if(position<0 || position>count) {
			System.out.println("insert position error; the number of current list is "+count);
			return null;
		}
		if(position==0) {
			newNode.next = head;
			head = newNode;
		}
		else {
			
			MyListNode preNode = null;
			for(i=0; i<position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		count++;
		return newNode;
				
	}
	
	public MyListNode removeElement(int position) {
		
		int i;
		MyListNode tempNode = head;
		MyListNode preNode = null;
		
		if( position ==0) {
			head = tempNode.next;
			
		}
		else {
			for(i=0; i<position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
				
			}
			preNode.next = tempNode.next;
		}
		count --;
		return tempNode;
		/*반환된 데이터를 사용하지 않을 경우, 단순히 무시할 수도 있습니다. 하지만 메서드에서 반환값을 제공하는 것은 유용한 정보를 제공하고, 추가적인 작업을 수행할 수 있는 기회를 제공합니다.

따라서 removeElement 메서드에서 제거된 노드를 반환하는 것은 유연성과 재사용성을 높이기 위한 목적입니다. 프로그래머는 상황에 따라 반환된 노드를 적절하게 처리할 수 있습니다.
*/
	}
	
	
	public MyListNode getNode(int position) {
		int i;
		MyListNode tempNode = head;
		
		if(position >= count) {
			System.out.println("search position error; the number of current list is "+ count);
			return null;
		}
		
		if(position==0) {
			return head;
		}
		
		for(i=0; i<position; i++) {
			tempNode = tempNode.next;
		}
		return tempNode;
	}
	
	
	public void removeAll() {
		head = null;
		count = 0;
		
	}
	
	public int getSize() {
		return count;
	}
	
	public void printAll() {
		if (count==0) {
			System.out.println("there's nothing to print");
			return;
		}
		MyListNode temp = head;
		while(temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null) {
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty() {
		if(head==null) return true;
		else return false;
	}
}
