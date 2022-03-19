package org.ddongq.test;
/*
Q1. Test01.java 상속 관계로 구현하시오.

Student.java				- 필드 : String name, int age, String School
							- 메소드 : Constructor, output()
Worker.java					- 필드 : String name, int age, String job
							- 메소드 : Constructor, output()
→ 부모클래스는 알아서 만들어보자!(Human.java)
*/

class Human{
	String name;
	int age;
	// 생성자
	public Human() {
	}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 메소드
	void output(){
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
//		System.out.println("이름 : " + name + "\n나이 : " + age);
	}
}

class Student extends Human {
	String school;
	// 생성자
	public Student() {
	}
	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	// 메소드
	@Override
	void output() {
		super.output();
		System.out.println("학교명 : "+ school);
	}
}

class Worker extends Human {
	String job;
	// 생성자
	public Worker() {
	}
	public Worker(String name, int age, String job) {
		super(name, age);
		this.job = job;
	}
	// 메소드
	@Override
	void output() {
		super.output();
		System.out.println("직장명 : "+ job);
	}
}

public class Test01 {
	public static void main(String[] args) {
		Worker worker = new Worker("홍길동", 18, "구트");
		worker.output();
		
		System.out.println("----------------");
		
		Student student = new Student("짱구", 28, "방통대");
		student.output();
	}
}
