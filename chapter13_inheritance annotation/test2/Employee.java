package org.ddongq.test2;

public class Employee {
	
	// 필드
	String name, dept;

	// 생성자
	public Employee() {}

	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	// 메소드
	int pay() {
		return 0;
	}
	
	void output() {
		System.out.println("이   름 : " + name);
		System.out.println("부   서 : " + dept);
	}
	
}
