package org.ddongq.test2;

public class Notebook extends Computer {
	
	// 필드
	String battery;
	
	// 생성자
	public Notebook() {}

	public Notebook(String model, int price, String battery) {
		super(model, price);
		this.battery = battery;
	}
	
	// 메소드
	@Override
	void output() {
		super.output();
		System.out.println("배터리 사용 시간 : " + battery);
	}
	
}
