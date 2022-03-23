package org.ddongq.test2;

public class Circle {
	
	// 필드
	Coordinate center;
	double radius;
	
	// 생성자
	public Circle() {}

	public Circle(Coordinate center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	
	// 메소드
	void output() {
		center.output();
		System.out.println("반지름 : " + radius);
	}
	
}
