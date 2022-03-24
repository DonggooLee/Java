package org.ddongq.ex;

class Animal{
	public void move() {}
}

class Dog extends Animal{
	@Override
	public void move() {
		System.out.println("개가 달린다");
	}
}

class Dolphin extends Animal{
	@Override
	public void move() {
		System.out.println("돌고래가 헤엄친다");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리 달린다");
	}
	public void fly() {
		System.out.println("독수리만 날 수 있다");
	}
}

public class Ex03_polymorphism {
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[3];
		
		// 각 인덱스에 자식 클래스 대입 후 move() 메소드 실행 (반복문)
		
		animals[0] = new Dog();
		animals[1] = new Dolphin();
		animals[2] = new Eagle();
		
		for(int i=0; i<animals.length; i++) {
			animals[i].move();
		}
		
//		animals[2].fly();	// 부모클래스인 Animal에는 fly() 메소드가 없기 때문에 호출 X
		
		// 바꿀수 있는지 유무 판단이 우선 되어야 한다. (instanceof)
		if(animals[2] instanceof Eagle) {
			Eagle eagle = (Eagle)animals[2];	// 다운캐스팅
			eagle.fly();
		}
		
		// 객체 생성 및 형변환 (1번 방법)
		Eagle eagle = (Eagle)animals[2];		// 다운캐스팅
		eagle.fly();
		
		// 객체 생성 없이 형변환 (2번 방법)
		((Eagle)animals[2]).fly();				// 다운캐스팅
		
	}
}
