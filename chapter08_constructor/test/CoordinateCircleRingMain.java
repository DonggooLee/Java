package org.ddongq.test;

public class CoordinateCircleRingMain {
	public static void main(String[] args) {
		
//		★★★ 객체 참조해서 던져주는 방식 ★★★
		Coordinate coo1 = new Coordinate(3,6);
		Coordinate coo2 = new Coordinate(5,12);
		Circle cir1 = new Circle(coo1, 5.3);
		Circle cir2 = new Circle(coo2, 10.7);
		Ring ring = new Ring(cir1, cir2);
		ring.output();
		
//		Ring ring = new Ring(new Circle(new Coordinate(3,6), 5.3), new Circle(new Coordinate(5,12), 10.7));
//		ring.output();
		
	}
}
