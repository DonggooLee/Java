package org.ddongq.test;

public class Employee {
//	필드 : String name, String dept
//	메소드 : Constructor, int pay(), void output()
	
	// 필드
	private String name, dept;
	
	// 생성자
	public Employee() {}

	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	// 메소드
	public int pay() {
		return 0;
	}
	
	public void output() {
		System.out.println("이 름 : " + name);
		System.out.println("부 서 : " + dept);
	}
	
}
