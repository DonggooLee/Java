package org.ddongq.ex;

public class Ex03_Person {
	// 필드
	private String name;
	private int age;
	private double height;
	private char gender;
	
	// 생성자
	public Ex03_Person() {
	}
	public Ex03_Person(String name, int age, double height, char gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}
	
	// 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		// 이름의 길이가 반드시 2이상 이어야한다. (제한을 걸 수 있다)
		if(name.length() >= 2) {
			this.name = name;
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		// 나이는 0~150살 사이만 입력 가능
		if(age>=0 && age<=150) {
		this.age = age;
		}
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		// 키는 0~300 사이만 입력 가능
		if(height>=0 && height<=300) {
		this.height = height;
		}
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		// 성별은 '남', '여'만 가능
		if(gender=='남' || gender=='여') {
			this.gender = gender;
		}
	}
}
