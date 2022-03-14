package org.ddongq.test;

public class Dog {
	
	String name, breed;
	int age;
	
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
		System.err.println("이름 : "+name);
		System.err.println("나이 : "+age);
		System.err.println("품종 : "+breed);
	}
	
}
