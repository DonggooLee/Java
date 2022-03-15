package org.ddongq.ex;

public class Ex02_Person {
	
	// 필드
	String name;
	int age;
	double height;
	char gender;
	
	public Ex02_Person() {}
	public Ex02_Person(String name, int age, double height, char gender) {
		this.name = name;		// this.name은 전역변수 name 의미.
		this.age = age;
		this.height = height;
		this.gender = gender;
	}

	void output() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("성별 : " + gender);
	}
	
}
