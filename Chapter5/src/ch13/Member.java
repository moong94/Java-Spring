package ch13;

import java.util.Comparator;

public class Member implements Comparator<Member>{

	private int memberId;	//회원 아이디
	private String memberName; //회원
	
	public Member() {}
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는" +  memberId + "입니다.";
	}

	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberId - member2.memberId);
	}
	
//	@Override
//	public int compareTo(Member member) {
//		
//		return (this.memberId - member.memberId);
//	}
}
