package org.ddongq.test;

import java.util.Scanner;

public class Rect {
	int width;
	int height;
	
	void init() {
		Scanner sc = new Scanner(System.in);	// 좋은 방식은 아님 보통 메인에서 입력
		System.out.print("너비 입력 : ");
		width = sc.nextInt();
		System.out.print("높이 입력 : ");
		height = sc.nextInt();
		sc.close();
	}
	
	void info() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		calcArea();
	}
	
	void calcArea() {
		System.out.println("크기 : " + (width * height));
	}
	
}
