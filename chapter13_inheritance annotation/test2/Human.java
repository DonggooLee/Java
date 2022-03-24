package org.ddongq.test2;

public class Human {
	
	// 필드
	String name;
	int age;
	
	// 생성자
	public Human() {}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메소드
	void output(){
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}
