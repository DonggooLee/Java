package org.ddongq.ex;
/*
 * 메소드 오버로딩
 * 1. 메소드들의 이름이 같다
 * 2. 매개변수가 다르다
 * 3. 리턴은 상관없다
 */

public class Ex01_Rect {
	
	// 필드
	int width, height;
	boolean isSquare;
	
	// 입력 메소드 2개
	void setFields(int w, int h) {
		width = w;
		height = h;
		isSquare = (w==h) ? true : false;
//		if (w==h) {
//			isSquare = true;
//		}else {
//			isSquare = false;
//		}
	}
	
	void setFields(int side) {
		width = side;
		height = side;
		isSquare = true;
	}
	
	// 계산 메소드 1개
	int clacArea() {
		return width * height;
	}
	
	// 출력 메소드 1개
	void output() {
		//너비, 높이, 크기, 정사각형 유무 출력
		System.out.println("높이 : " + height);
		System.out.println("너비 : " + width);
		System.out.println("크기 : " + clacArea());
//		System.out.println("정사각형? : " + isSquare);
		System.out.println("정사각형? : " + (isSquare ? "정사각형" : "직사각형"));
	}
}
