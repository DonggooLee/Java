package org.ddongq.test;

public class Ring {
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
	
	Circle inner;
	Circle outer;
	
	public Ring() {

	}

	public Ring(Circle inner, Circle outer) {
		this.inner = inner;
		this.outer = outer;
	}
	
	void output() {
		System.out.println("안쪽 원의 정보");
		inner.output();
		
		System.out.println("------------------------");
		
		System.out.println("바깥쪽 원의 정보");
		outer.output();
	}
	
}
