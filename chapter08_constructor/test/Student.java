package org.ddongq.test;

public class Student {
	
	// 필드
	String name, dept;
	Grade grade;
	
	// 생성자
	public Student() {

	}

	public Student(String name, String dept, Grade grade) {
		this.name = name;
		this.dept = dept;
		this.grade = grade;
	}
	
	// 메소드
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + dept);
		System.out.println("평균 : " + grade.getAverage()); //주로 메소드로 접근
		System.out.println("학점 : " + grade.getGrade());
	}
	
}
