package ch14;

import java.util.HashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberhashmap = new MemberHashMap();
		
		
		Member memberKim = new Member(1003, "김유신");
		Member memberLee = new Member(1001, "이순신");
		Member memberKang = new Member(1002, "강감찬");
		Member memberHong = new Member(1004, "홍길동");
		
		
		memberhashmap.addMember(memberKim);
		memberhashmap.addMember(memberHong);
		memberhashmap.addMember(memberLee);
		memberhashmap.addMember(memberKang);
		memberhashmap.showAllMember();
		
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(1001, "kim");
		hashMap.put(1002, "roh");
		hashMap.put(1003, "kwak");
		hashMap.put(1004, "ryu");
		
		System.out.println(hashMap);
		
	}
}