package org.ddongq.ex;

// 부모 클래스
class Person {
	void sleep() {
		System.out.println("잔다");
	}
	void eat(String food) {
		System.out.println(food + " 먹는다");
	}
}

// 자식 클래스
class Student extends Person {
	void study() {
		System.out.println("공부한다.");
	}
}


public class Ex02_inheritance {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.sleep();
		student.eat("치킨");
		student.study();
		
	}
}
