package org.ddongq.test2;

public class Student extends Human {
	
	// 필드
	String school;
	
	// 생성자
	public Student() {}

	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	
	// 메소드
	@Override
	void output() {
		super.output();
		System.out.println("학교 : "+school);
	}
	
}
