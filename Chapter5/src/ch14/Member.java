package ch14;

public class Member implements Comparable<Member>{
	
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
		
		return (this.memberId - member.memberId)*(-1);
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}
	
	public boolean equals(Object Obj) {
		if(Obj instanceof Member) {
			Member member = (Member)Obj;
			if(this.memberId == member.memberId)
				return true;
			else
				return false;
		}
		return false;
	}
	
	public String toString() {
		return memberName + "client's ID is "+ memberId;
	}
	

}
