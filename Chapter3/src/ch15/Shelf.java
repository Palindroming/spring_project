
/*
protected와 private는 모두 자바에서 접근 제어자로 사용되지만, 접근 범위가 다릅니다.

private
클래스 내부에서만 접근 가능합니다.
같은 클래스 내에서는 어디서든 접근할 수 있습니다.
클래스 외부(다른 클래스 또는 상속받은 클래스)에서는 접근할 수 없습니다.
정보 은닉(information hiding)을 구현하기 위해 사용됩니다.
protected
같은 패키지 내에서는 어디서든 접근 가능합니다.
다른 패키지에 속한 클래스에서는 접근할 수 없습니다.
단, 다른 패키지에 속한 클래스라도 상속받은 클래스에서는 접근 가능합니다.
상속 관계에 있는 클래스 간의 접근을 허용하기 위해 사용됩니다.	
*/
package ch15;

import java.util.ArrayList;

public class Shelf {
	
	
	protected ArrayList<String> shelf = new ArrayList();

//	public Shelf() {
//		shelf = new ArrayList(); // 이 방식에서는 shelf 변수를 먼저 선언한 후, 생성자 내부에서 ArrayList 인스턴스를 생성하고 할당하고 있습니다.
//		//이 방식을 사용하면 생성자 외부에서도 shelf 변수에 접근할 수 있으며, 필요에 따라 다른 초기화 작업을 수행할 수 있습니다.
//		
//	}
//	
	public ArrayList<String>getShelf(){
		return shelf;
	}
	
	 int getCount() {
		return shelf.size();
	}

}
