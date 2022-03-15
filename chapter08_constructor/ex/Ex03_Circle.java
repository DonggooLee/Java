package org.ddongq.ex;

public class Ex03_Circle {
	/*
	 * 필드
	 *  - int x,y
	 *  - double radius
	 *  
	 * 메소드
	 *  - 기본 생성자 -> 좌표 0,0
	 *  - r 값만 받는 생성자 -> 좌표 0,0
	 *  - 각 좌표 및 r 값만 받는 생성자
	 *  - calcArea(원의 크기계산 후 리턴)  -> PI * r * r
	 *  - calcCircum(원의 둘레계산 후 리턴)  -> PI * r
	 *  - output(중심 좌표, 반지름, 크기, 둘레 출력)
	 *  
	 *  *** PI 구하기 -> Math.PI
	 */
	
	int x, y;
	double radius;
	
	public Ex03_Circle() {
		x = 0;
		y = 0;
		radius = 1;
	}

	public Ex03_Circle(double radius) {
		x = 0;
		y = 0;
		this.radius = radius;
	}

	public Ex03_Circle(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	double calcArea() {
		return Math.PI * radius * radius;
	}
	
	double calcCircum() {
		return Math.PI * radius;
	}
	
	void output() {
		System.out.println("중심좌표 : [ x=" + x + ", y="+ y+" ]");
		System.out.println("반지름 : " + radius);
		System.out.println("크기 : " + calcArea());
		System.out.println("둘레 : " + calcCircum());
	}


}
