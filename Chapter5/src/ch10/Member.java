package ch10;

public class Member {

	private int memberId;	//ȸ�� ���̵�
	private String memberName; //ȸ��
	
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
}
