package org.ddongq.test;

public class CircleMain {
	public static void main(String[] args) {
		// 1. Book 객체(인스턴스) 생성
		// 클래스명 객체명 = new 클래스명();
		Circle test = new Circle();
		
		// 객체를 통한 데이터 초기화
		test.name = "피자";
		test.radius = 5;
		
		test.info();
	}
}
