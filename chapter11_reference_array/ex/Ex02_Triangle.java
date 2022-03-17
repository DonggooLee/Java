package org.ddongq.ex;

public class Ex02_Triangle {
	/*
	 * 필드
	 *  - width, height
	 * 
	 * 메소드
	 *  - 생성자
	 *  - calcArea(크기 리턴)
	 *  - output
	 */
	
	int width, height;
	
	// 생성자
	public Ex02_Triangle() {

	}

	public Ex02_Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 메소드
	double calcArea() {
		return width * height / 2.0;
	}
	
	void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
	}
	
}
