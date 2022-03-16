package org.ddongq.test;

public class Circle {
	/*
	Q4.
	Coordinate.java			필드 - int x, int y
							메소드 - Constructor, output
	Circle.java				필드 - Coordinate center, double radius
							메소드 - Constructor, output
	Ring.java				필드 - Circle inner, Circle outer
							메소드 - Constructor, output
	CoordinateCircleRingMain.java
	*/
	
	Coordinate center;
	double radius;
	
	// 생성자
	public Circle() {

	}

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
