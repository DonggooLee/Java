package org.ddongq.ex;

interface Animal {
	void walk();
}

class Dog implements Animal {
	@Override
	public void walk() {
		System.out.println("산책한다.");
	}
	public void sleepTogether() {
		System.out.println("같이잔다.");
	}
}

class Crocodile implements Animal {
	@Override
	public void walk() {
		System.out.println("악어 걷는다");
	}
}

public class Ex05_exception {
	
	public static void verifyDog(Animal animal) {
		
		// 1. instanceof 연산자를 이용한 예외처리
		animal.walk();
		if(animal instanceof Dog) {
			((Dog)animal).sleepTogether();
		}else {
			System.out.println("같이 잘 수 없다.");
		}
		
		// 2. try-catch 를 이용한 예외처리
		animal.walk();
		try {
			((Dog)animal).sleepTogether();
		} catch (ClassCastException e) {
			System.out.println("같이 잘 수 없다.");
		}
		
	}
	
	public static void main(String[] args) {
		verifyDog(new Dog());			// 업캐스팅
		verifyDog(new Crocodile());		// 업캐스팅
	}
	
}
