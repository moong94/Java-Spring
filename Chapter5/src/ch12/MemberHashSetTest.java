package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "Lee");
		Member memberKim = new Member(1002, "Kim");
		Member memberKang = new Member(1003, "Kang");
		Member memberHong = new Member(1003, "Hong");
		
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		memberHashSet.addMember(memberHong);
		
		memberHashSet.showAllMember();
		memberHashSet.removeMember(memberKim.getMemberId());
		memberHashSet.showAllMember();
	}

}
