package org.ddongq.test2;

public class Computer {
	
	// 필드
	String model;
	int price;
	
	// 생성자
	public Computer() {}
	
	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	// 메소드
	void output() {
		System.out.println("모델 : " + model);
		System.out.println("가격 : " + price);
	}
	
}
