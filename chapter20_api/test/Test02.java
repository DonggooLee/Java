package org.ddongq.test;

class User {
	
	// 필드
	private String id, password;
	// 생성자
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}
	// 메소드
	@Override
	public String toString() {
		return "아이디 : " + id + ", 비밀번호 : " + password;
	}
	@Override
	public boolean equals(Object obj) {	// 업캐스팅
		if(obj != null && obj instanceof User) {
			User user = (User)obj;
			return id.equals(user.id) && password.equals(user.password);
		}
		return false;
	}
	
}

public class Test02 {
	public static void main(String[] args) {
		
		User user1 = new User("zxcv1234", "123456");
		User user2 = new User("zxcv1234", "123456");
		
		System.out.println("유저 1 : " + user1.toString());	// toString 없어도 출력이 가능!
		System.out.println("유저 2 : " + user2.toString());
		
		if(user1.equals(user2)) {
			System.out.println("같은 계정");
		}else {
			System.out.println("다른 계정");
		}
				
	}
}
