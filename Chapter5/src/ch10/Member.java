package ch10;

public class Member {
	
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
		}
	
	
	public int getMemberId() {
		return memberId;
		
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getmemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	public String toString() {
		return memberName + "your id is "+ memberId;
	}
}
