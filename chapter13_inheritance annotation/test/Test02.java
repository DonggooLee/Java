package org.ddongq.test;
/*
Q2. Test02.java 상속 관계로 구현하시오.
Notebook.java				- 필드 : String model, int price, int battery
							- 메소드 : Constructor, output()	
Tablet.java					- 필드 : String model, int price, int battery, String pen
							- 메소드 : Constructor, output()
→ 부모클래스는 알아서 만들어보자!		
 */

class Computer{
	String model;
	int price;
	// 생성자
	public Computer() {
	}
	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	// 메소드
	void output() {
		System.out.println("모 델 : " + model);
		System.out.println("가 격 : " + price);
	}
}

class Notebook extends Computer {
	int battery;
	// 생성자
	public Notebook() {
	}
	public Notebook(String model, int price, int battery) {
		super(model, price);
		this.battery = battery;
	}
	// 메소드
	@Override
	void output() {
		super.output();
		System.out.println("배터리 용량 : " + battery);
	}
}

class Tablet extends Notebook{
	String pen;
	// 생성자
	public Tablet() {
	}
	public Tablet(String model, int price, int battery, String pen) {
		super(model, price, battery);
		this.pen = pen;
	}
	// 메소드
	@Override
	void output() {
		super.output();
		System.out.println("펜슬 정보 : " + pen);
	}
}

public class Test02 {
	public static void main(String[] args) {
		Tablet tablet = new Tablet("Appple", 760000, 20000, "애플펜슬");
		tablet.output();
		
		System.out.println("----------------");
		
		Notebook notebook = new Notebook("Samsung", 500000, 18000);
		notebook.output();
	}
}
