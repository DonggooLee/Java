package org.ddongq.test;

public class Dog {
	/*
	    Q2.
		클래스 Dog을 정의하시오.
		- 필드 : String name, String breed, int age
		- 메소드 : setDog(name, age) : 품종은 푸들
				setDog(name, age, breed) 
				info(name, age, breed)
		클래스 DogMain을 정의하시오.
	 */
	
	// 필드
	String name, breed;
	int age;
	
	// 메소드
	void setDog(String _name, int _age) {
		name = _name;
		age = _age;
		breed = "푸들";
	}
	
	void setDog(String _name, int _age, String _breed) {
		name = _name;
		age = _age;
		breed = _breed;
	}
	
	void info() {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("품종 : "+ breed);
	}
	
}
