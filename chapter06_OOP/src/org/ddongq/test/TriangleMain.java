package org.ddongq.test;

import java.util.Scanner;

class Triangle {
	int width;
	int height;
	// int width, height; >> 같은 타입은 하나로 묶기
	
	void init() {
		Scanner sc = new Scanner(System.in);	// 좋은 방식은 아님 보통 메인에서 입력
		System.out.print("너비 입력 : ");
		width = sc.nextInt();
		System.out.print("높이 입력 : ");
		height = sc.nextInt();
		sc.close();
	}
	
	void info() { //출력
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("넓이 : " + calcArea());
	}
	
	double calcArea() { //계산
		return (width*height/2.0);
	}
	
}

public class TriangleMain {
	public static void main(String[] args) {
		Triangle test = new Triangle();
		test.init();
		test.info();
	}
}
