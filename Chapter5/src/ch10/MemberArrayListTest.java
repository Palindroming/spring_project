package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		
		Member Lee = new Member(1001, "이순신");
		Member Kim = new Member(1002, "김두관");
		Member Jun = new Member(1003, "전두광");
		Member Roh = new Member(1004, "노무현");
		
		memberArrayList.addMember(Roh);
		memberArrayList.addMember(Kim);
		memberArrayList.addMember(Lee);
		memberArrayList.addMember(Jun);
		
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(Kim.getMemberId());
		
		memberArrayList.showAllMember();

	}

}
