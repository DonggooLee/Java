package org.ddongq.ex;

import java.util.Scanner;

public class Ex02_TriangleMain {
	public static void main(String[] args) {
		/*
		 * 1. 크기 3의 참조 배열 arr 를 선언
		 * 2. 반복문을 이용하여 객체를 생성함과 동시에 값을 초기화 시킨다. (스캐너 입력) 
		 * 3. 반복문을 이용하여 각 인덱스에 들어가 있는 값을 출력한다.
		 */
		
		// 1. Triangle 클래스를 3개 생성하겠다
		Ex02_Triangle[] arr = new Ex02_Triangle[3];
		Scanner scanner = new Scanner(System.in);
	
		// 2. 
		for(int i=0; i<arr.length; i++) {
			System.out.println("너비 입력 : ");
			int w = scanner.nextInt();
			System.out.println("높이 입력 : ");
			int h = scanner.nextInt();
			arr[i] = new Ex02_Triangle(w, h);	// 실제 Triangle 객체 생성 및 초기화
		}
		
		// 3.
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+1) + "번 삼각형 ----");
			arr[i].output();	// arr[i] 라는 객체.메소드
		}
		
		scanner.close();
	}
}
