package org.ddongq.test;

/*
	Q3. Test03.java
	hashMap을 이용 하여 회원(Member)을 저장하시오.
	key : Member, value : 포인트 점수 
	동일한 회원은 저장될 수 없다.
	
	Member 클래스 			필드 :int no, String name, String memberShip("VIP", "GOLD", "SILVER")
	3명의 회원정보를 저장하시오.
	중복 회원도 입력하시오.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap 사용을 위해선 중복 데이터 저장 방지를 위해서 hashCode(), equals()의 오버라이드 해야한다.★
// 자동 삽입을 이용하자!!!

class Member{
	private int no;
	private String name, memberShip;
	
	public Member(int no, String name, String memberShip) {
		this.no = no;
		this.name = name;
		this.memberShip = memberShip;
	}

	@Override  
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberShip == null) ? 0 : memberShip.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		return result;
		/*
		 * 해시코드를 더하고 31을 곱하고 있다.
		 * 
		 * 31과 1을 사용하는 이유
		 * 소수이면서 홀수이기 때문에!
		 * 32로 곱셈을 하게 되면 bit shift가 발생해서 한쪽이 0으로 차게 되므로 하지 않는다고 한다.
		 * 소수를 사용하는 이점은 분명하지 않지만 전통적으로 널리 사용 중
		 */
	}

	@Override
	public boolean equals(Object obj) {
		// obj 객체가 null이 아니고, 형 변환이 가능하고, 각 자원이 같아야 참
		if (this == obj)
			return true;
		
		if (!(obj instanceof Member))	// 형변환 불가능하다면? false
			return false;
		
		Member other = (Member) obj;
		if (memberShip == null) {
			if (other.memberShip != null)
				return false;
		} else if (!memberShip.equals(other.memberShip))
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		if (no != other.no)
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "Member [no : " + no + ", name : " + name + ", memberShip : " + memberShip + "]";
	}
		
}

public class Test03 {
	public static void main(String[] args) {
	 
		Map<Member, Integer> map = new HashMap<Member, Integer>();
				
		map.put(new Member(1, "마지", "VIP"), 100);
		map.put(new Member(2, "셀마", "GOLD"), 90);
		map.put(new Member(3, "패티", "SILVER"), 50);
		map.put(new Member(1, "마지", "VIP"), 150);
		
		// 키 뭉치 가져올때 Set을 이용한다
		Set<Member> set = map.keySet();
		Iterator<Member> itr = set.iterator();
				
		// 안에 객체가 있다면 true
		while(itr.hasNext()) {
			Member key = itr.next();	// 멤버 객체가 키값이다 Member key = new Member(1, "마지", "VIP"), 100) << 이러한 형태
			Integer point = map.get(key);
			System.out.println(key);
			System.out.println("위 회원의 포인트 : " + point);
		}
		
	}
}

