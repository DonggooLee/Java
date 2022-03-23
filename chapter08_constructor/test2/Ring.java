package org.ddongq.test2;

public class Ring {
	
	// 필드
	Circle inner;
	Circle outer;
	
	// 생성자
	public Ring() {}

	public Ring(Circle inner, Circle outer) {
		this.inner = inner;
		this.outer = outer;
	}
	
	// 메소드
	void output() {
		System.out.println("안쪽 원의 정보");
		inner.output();
		System.out.println("바깥쪽 원의 정보");
		outer.output();
	}
	
}
