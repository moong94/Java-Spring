package ch14;

import java.util.HashMap;

import ch14.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001, "Lee");
		Member memberKim = new Member(1002, "Kim");
		Member memberKang = new Member(1003, "Kang");
		Member memberHong = new Member(1004, "Hong");
		
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberKang);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1001,  "kim");
		hashMap.put(1002,  "lee");
		hashMap.put(1003,  "park");
		hashMap.put(1004,  "hong");
		
		System.out.println(hashMap);
		

	}

}
