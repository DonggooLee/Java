package org.ddongq.ex;

// 부모 클래스
class Parent{
	int number;
	
	void doParent() {
		System.out.println("doParent() 호출");
	}
}

// 자식 클래스
class Child extends Parent{
	void doChild() {
		System.out.println("doChild() 호출");
	}
}


public class Ex01_inheritance {
	public static void main(String[] args) {
		
		// 자식 클래스의 객체 (인스턴스) 생성 및 사용
		Child child = new Child();
		
		child.number = 10;
		System.out.println(child.number);
		
		child.doParent();
		child.doChild();
		
	}
}
