package org.ddongq.ex;

interface Animal {
	
	void move(); 						// 자동으로 public abstract void move(); 처리가 된다
	default void eat(String food) {		// 자동으로 public 처리가 된다.
		System.out.println(food + "먹는다");
	}
	
}

class Dog implements Animal {

	@Override
	public void move() {
		System.out.println("개가 달린다");
	}
	
}

public class Ex01_interface {
	public static void main(String[] args) {
		
		Animal animal = new Dog();			// 업캐스팅
		
		animal.eat("사료");
		animal.move();
		
	}
}
