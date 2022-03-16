package org.ddongq.ex;

public class Ex03_Team {
	// 필드
	String name;
	static int count = 0; 	// 모든 team이 공유하는 자원

	public Ex03_Team(String name) {
		this.name = name;
		count++;
	}
	
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("현재팀원 : " + count + "명");
	}
	
}
