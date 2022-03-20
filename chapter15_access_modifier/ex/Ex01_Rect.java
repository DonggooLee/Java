package org.ddongq.ex;

public class Ex01_Rect {
	/*
	 * 필드
	 * width, height, isSquare
	 * 
	 * 메소드
	 * 생성자 - 기본 1,1 고정
	 * 			값 1개 받는 생성자
	 * 			값 2개 받는 생성자
	 * 
	 * output(), int calcArea()
	 * 
	 * 
	 * 필드는 private 처리
	 * 생성자 및 메소드는 public
	 */

	private int widith, height;
	private boolean isSquare;
	
	public Ex01_Rect() {
		widith = 1;
		height = 1;
	}
	
	public Ex01_Rect(int side) {
		widith = side;
		height = side;
		isSquare = true;
	}
	
	public Ex01_Rect(int widith, int height) {
		this.widith = widith;
		this.height = height;
		isSquare = (widith==height? true:false);
	}
	
	private int calcArea() {
		return widith * height;
	}
	
	public void output() {
		System.out.println("가로 : " + widith);
		System.out.println("세로 : " + height);
		System.out.println("크기 : " + calcArea());
		System.out.println("정사각형 ? " + (isSquare? "정사각형":"직사각형"));
	}
	
}
