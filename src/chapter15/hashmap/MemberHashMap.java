package chapter15.hashmap;

import java.util.HashMap;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap = new HashMap<Integer, Member>();

	// 생성자(HashMap 참조 메모리 확보)

	// addMember 메서드
	public void addMember(Member mem) {
		hashMap.put(mem.memberId(), mem);
	}

	// removeMember: hashMap.containsKey(memberId)
	public void removeMember(int num) {
		if (hashMap.containsKey(num)) {
			hashMap.remove(num);
			System.out.println(num + "번 아이디 삭제 완료");
		} else {
			System.out.println("없는 아이디");
		}
	} //removeMember
	
	public void showAllMember() {
		 for (Member m : hashMap.values()) {
		        System.out.println(m);
		    }	
		 }

}
