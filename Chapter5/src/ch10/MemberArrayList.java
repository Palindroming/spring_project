package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		
		arrayList = new ArrayList<Member>();
		
	}
	
public MemberArrayList(int size) {
		
		arrayList = new ArrayList<Member>(size);
		
	}
	/*
	 * 주어진 코드는 MemberArrayList 클래스의 생성자(Constructor)입니다. 이 생성자는 매개변수로 정수 size를 받아들이고, 해당 크기의 ArrayList<Member> 인스턴스를 생성합니다.
	 */
public void addMember(Member member) {
	arrayList.add(member);
	
}

//public boolean removeMember(int memberId) {
//	for (int i = 0; i<arrayList.size(); i++) {
//		Member member = arrayList.get(i);
//		
//		int tempId = member.getMemberId();
//		if(tempId == memberId) {
//			arrayList.remove(i);
//			return true;
//		}
//		
//	}
//	System.out.println("no "+memberId);
//	return false;
//}

public boolean removeMember(int memberId) {
	Iterator<Member> ir = arrayList.iterator();
	
	while(ir.hasNext()){
		Member member = ir.next();
		int tempId = member.getMemberId();
		
		if(tempId == memberId ) {
			arrayList.remove(member);
			return true;
		}
		
	}
	System.out.println("there's no "+ memberId);
	return false;
}

public void showAllMember() {
	for (Member member: arrayList) {
		System.out.println(member);
		
	}
	System.out.println();
}



}
