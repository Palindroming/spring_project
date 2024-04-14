package ch12;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		
		Member memberKim = new Member(1003, "김유신");
		Member memberLee = new Member(1001, "이순신");
		Member memberKang = new Member(1002, "강감찬");
		Member memberHong = new Member(1004, "홍길동");
		
		
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.showAllMember();
		
	}
}