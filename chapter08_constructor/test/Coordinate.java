package org.ddongq.test;

public class Coordinate {
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
	
	int x, y;
	
	// 생성자
	public Coordinate() {

	}

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 메소드
	void output() {
		System.out.println("중심좌표 : (X=" + x + ", Y=" + y + ")");
	}
	
	
}
