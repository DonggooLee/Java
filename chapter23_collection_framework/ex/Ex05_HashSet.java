package org.ddongq.ex;

import java.util.HashSet;
import java.util.Set;

class User {
	
	// 필드
	private String id, pw;

	// 생성자
	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	@Override
	public int hashCode() {
		// return 1;
		// return id.length();		// hashCode값을 지정하는 방법은 다양하다.
		// return id.charAt(0);		// id 첫글자 확인
		return id.charAt(0) + pw.length();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof User) {
			User other = (User)obj;
			return id.equals(other.id) && pw.equals(((User)obj).pw);
		}else {
			return false;
		}
	}

}

public class Ex05_HashSet {
	public static void main(String[] args) {
		
		// 제네릭에 본인이 직접만든 User 클래스를 사용
		Set<User> set = new HashSet<User>();
		
		// 객체를 만들어주라는 의미
		set.add(new User("admin", "1234"));
		set.add(new User("admin", "1234"));	// 인스턴스는 다르지만 내부 데이터가 동일 하므로 객체 1개만 저장
		
		System.out.println("set의 총 객체 수 : " + set.size());
		// set은 중복제거를 해주는데 왜 2개가 들어가는가?
		// 사용자가 직접만든 클래스들은 equals 가 자동으로 되지 않기 때문에 직접 해줘야한다
		// 따라서 위에 User 클래스에 보면 hashCode(), equals(Object obj) 오버라이드 받음
		
	}
}
