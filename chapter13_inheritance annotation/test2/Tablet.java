package org.ddongq.test2;

public class Tablet extends Notebook {
	
	// 필드
	String pen;
	
	// 생성자
	public Tablet() {}

	public Tablet(String model, int price, String battery, String pen) {
		super(model, price, battery);
		this.pen = pen;
	}

	// 메소드
	@Override
	void output() {
		super.output();
		System.out.println("펜슬 명칭 : " + pen);
	}
	
}
