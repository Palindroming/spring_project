package ch12;



public class Member implements Comparable<Member> {
	
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

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public int compareTo(Member member) {
		
		if(this.memberId > member.memberId) {
			return 1;
		}
		else if (this.memberId < member.memberId) {
		
		return -1;
	}
		else return 0; }
	
	
	public int hashCode() {
		return memberId;
	}
	
	public String toString() {
		return memberName + " client's ID is "+ memberId;
		
	}
	
	

}
