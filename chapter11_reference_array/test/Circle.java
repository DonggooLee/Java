package org.ddongq.test;

public class Circle {
	/*
	Q1.
	Cricle.java 		- 필드 : double radius
						- 메소드 : Constructor, calcArea, output
	CricleMain.java		  Circle 3개 생성 (반지름 입력 받아서 처리), 가장 크기가 큰 Circle 출력

	★
	calcArea => Math.PI * Math.pow(radius, 2)
	output => 반지름, 크기 출력
	*/
	
	// 필드
	double radius;
	
	// 생성자
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// 계산 메소드
	double calcArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	// 출력 메소드 (이렇게 만들면 기능별로 분류하기가 힘들다)
//	void calcArea2() {
//		System.out.println("원의 크기 : " + Math.PI * Math.pow(radius, 2));
//	}
	
	// 출력 메소드 (모든 출력은 한 곳에서 처리하는게 좋다 : 기능별 분류 목적!)
	void output() {
		System.out.println("반지름 : " + radius);
		System.out.println("원의 크기 : " + calcArea()); // return 타입으로 사용할 경우 출력
//		calcArea2(); // void 타입으로 사용할 경우 출력
	}
}
