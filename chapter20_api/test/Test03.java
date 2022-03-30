package org.ddongq.test;

class Coordinate {
	
	// 필드
	private int x, y;
	// 생성자
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// 메소드
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Coordinate) {
			Coordinate cor = (Coordinate)obj;
			return x==cor.x && y==cor.y; 
		}else {
			return false;
		}
	}
	
}

class Circle {
	
	// 필드
	private Coordinate center;
	private double radius;
	// 생성자
	public Circle(Coordinate center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	// 메소드
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Circle) {
			Circle other = (Circle)obj;	// 다운캐스팅
			return center.equals(other.center) && radius==other.radius;
		}else {
			return false;
		}
	}
	
}

public class Test03 {
	public static void main(String[] args) {
		
		Circle cir1 = new Circle(new Coordinate(0, 0), 1.5);
		Circle cir2 = new Circle(new Coordinate(0, 0), 2.5);
		
		if(cir1.equals(cir2)) {	// 오버라이딩 된 equals 라는 점 인지!
			System.out.println("동일한 써클");
		}else {
			System.out.println("다른 써클");
		}
		
	}
}
