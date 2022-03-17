package org.ddongq.ex;

public class Ex01_Person {
	/*
	 * 필드
	 *  - 이름 name
	 *  - 나이 age
	 *  - 신장 height
	 *  - 성별 gender
	 *  
	 * 메소드
	 *  - 생성자
	 *  - output()
	 */
	
	String name;
	int age;
	double height;
	char gender;
	
	public Ex01_Person() {

	}

	public Ex01_Person(String name, int age, double height, char gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}

	void output() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("성별 : " + gender);
	}
}
