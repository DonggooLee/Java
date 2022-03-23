package org.ddongq.test2;

public class CoordinateCircleRingMain {
	public static void main(String[] args) {
		
		// 객체 생성 없이 바로 집어 넣는 방법
		Ring ring1 = new Ring(new Circle(new Coordinate(1, 2), 3.5), new Circle(new Coordinate(2, 4), 5.5));
		ring1.output();
		
		System.out.println("----------------");
		
		// 객체 생성 후 집어넣는 방법
		Coordinate cor1 = new Coordinate(1, 2);
		Coordinate cor2 = new Coordinate(2, 4);
		
		Circle cir1 = new Circle(cor1, 3.5);
		Circle cir2 = new Circle(cor2, 5.5);
		
		Ring ring2 = new Ring(cir1, cir2);
		ring2.output();
		
	}
}
