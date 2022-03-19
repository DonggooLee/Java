package org.ddongq.ex;
/*
 * super
 * 
 * 1. 자식 클래스가 알고있는 부모 클래스의 참조
 * 2. 사용방법
 * 		1) super.필드 	: 부모 클래스의 필드 사용
 *    	2) super.메소드	: 부모 클래스의 메소드 사용
 *    	3) super() 		: 부모 클래스의 생성자 사용
 */

class Animal{
	
	String name;
	
	public Animal() {
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
}

class Dog extends Animal{
	
	String personName;
	
	public Dog(String personName) {
		super();						// super 클래스의 생성자 : Animal() { } 호출
		this.personName = personName;
	}
	
	public Dog(String name, String personName) {
		super(name);					// super 클래스의 생성자 : Animal(String name) { } 호출
		this.personName = personName;
	}
	
	void whoAmI(){
		System.out.println("내 이름은 " + name + "이고, 주인은 " + personName + "입니다");
	}
	
}

public class Ex05_constructor {
	public static void main(String[] args) {
		
		Dog dog = new Dog("홍길동");
		dog.whoAmI();
		
		System.out.println("---------------");
		
		Dog dog2 = new Dog("뽀삐", "앞집 아주머니");
		dog2.whoAmI();
		
	}
}
