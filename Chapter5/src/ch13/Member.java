package ch13;

import java.util.Comparator;

public class Member implements Comparator<Member>{

	private int memberId;	//ȸ�� ���̵�
	private String memberName; //ȸ��
	
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
		return memberName + " ȸ������ ���̵��" +  memberId + "�Դϴ�.";
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
