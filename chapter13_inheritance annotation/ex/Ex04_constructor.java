package org.ddongq.ex;
/*
 * 자식 클래스의 생성자는 부모 클래스의 생성자를 먼저 호출한다.
 * (자식이 만들어지려면 부모 먼저 만들어야 한다.)
 */

class Mother{
	// 생성자
	public Mother() {
		System.out.println("Mother 생성");
	}
}

class Son extends Mother{
	// 생성자
	public Son() {
		System.out.println("Son 객체 생성");
	}
	
	// 메소드
	void doSon() {
		System.out.println("doSon() 호출");
	}
	// super(); 클래스 만드는 것과 동일 <알트+쉬프트+s>
}


public class Ex04_constructor {
	public static void main(String[] args) {
		Son son = new Son();
		son.doSon();
	}
}
