package org.ddongq.ex;

public class Ex01_Rect {
	/*
	 * 필드
	 * - int width, height
	 * - boolean isSquare
	 * 
	 * 메소드
	 * - Ex01_Rect() --> w,h 1고정
	 * - Ex01_Rect(int side)
	 * - Ex01_Rect(int w, int h)
	 * - calcArea(크기 계산 후 리턴)
	 * - output(너비, 높이, 크기, 형태(정사각형 or 직사각형) 출력)
	 */
	
	int width, height;
	boolean isSquare;
	
	public Ex01_Rect() {
		width = 1;
		height = 1;
		isSquare = true;
		isSquare = (width==height);
	}
	
	public Ex01_Rect(int side) {
		width = side;
		height = side;
		isSquare = (width==height);
	}
	
	public Ex01_Rect(int w, int h) {
		width = w;
		height = h;
		isSquare = (width==height) ? true : false;
	}
	
	int calcArea(){
		return width * height;
	}
	
	void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
		System.out.println("형태 : " + (isSquare ? "정사각형":"직사각형"));
	}
	
	
}
