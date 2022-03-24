package org.ddongq.ex;

abstract class Animal{							// 추상 클래스
	
	abstract public void move();				// 추상 메소드
	public void eat(String food) {				// 일반 메소드
		System.out.println(food+" 먹는다");
	}
	
}

class Dog extends Animal {

	@Override
	public void move() {
		System.out.println("개가 달린다");
	}
	
}

public class Ex01_abstract {
	public static void main(String[] args) {
		
//		추상 클래스는 new 할 수 없다 (강제성 부여)
//		Animal animal = new Animal();
		
		Animal animal = new Dog();
		animal.move();
		animal.eat("사료");
		
	}
}
