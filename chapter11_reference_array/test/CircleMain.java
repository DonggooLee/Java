package org.ddongq.test;

import java.util.Scanner;

public class CircleMain {
	public static void main(String[] args) {
		
		// 입력을 위한 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// Circle 객체를 담을 배열 => 배열의 크기! 인덱스 번호!
		// 배열의 크기(길이) = 3, 인덱스 0, 1, 2로 인덱스 끝나는 번호는 lenght-1
		Circle[] circles = new Circle[3];
		
		/* 문제를 전부 풀어서 코드를 작성 했을 경우
		System.out.print("첫 번째 반지름 입력 : ");
		double r1 = sc.nextDouble();
		System.out.print("두 번째 반지름 입력 : ");
		double r2 = sc.nextDouble();
		System.out.print("세 번째 반지름 입력 : ");
		double r3 = sc.nextDouble();
		
		// Circle 객체 생성
		Circle c1 = new Circle(r1);
		Circle c2 = new Circle(r2);
		Circle c3 = new Circle(r3);
		
		// Circle 객체 배열에 대입
		circles[0] = c1; 
		circles[1] = c2; 
		circles[2] = c3;
		
		circles[0].output();
		circles[1].output();
		circles[2].output();
		
		// 최대 크기 구하기 ★★★★★
		double maxArea = circles[0].calcArea();
		int idx = 0;
		for(int i=0; i<circles.length; i++) {
			if(maxArea < circles[i].calcArea()) {
				maxArea = circles[i].calcArea(); // 가장 큰 크기의 값을 대입
				idx = i; // 가장 큰 원의 인덱스 번호 입력
			}
		}
		
		System.out.println("가장 크기가 큰 원의 인덱스 번호");
		System.out.println(idx);
		
		System.out.println("가장 크기가 큰 원의 크기");
		System.out.println(maxArea);
		
		System.out.println("가장 크기가 큰 원의 정보(반지름 & 크기)");
		circles[idx].output();
		*/
		
		// 3개의 반지름 입력 받기 (객체 생성 및 초기화)
		for(int i=0; i<circles.length; i++) {
			System.out.print((i+1)+"번째 반지름 입력 : ");
			double r = sc.nextDouble();
			circles[i] = new Circle(r);
		}
		
		// 가장 크기가 큰 Circle 출력
		double maxArea_ = circles[0].calcArea();
		int idx_ = 0; // 인덱스 번호를 받기 위해
		for(int i=1; i<circles.length; i++) {		// i=0 부터 비교하면 자신과 비교하기 때문에 의미 X
			if(maxArea_ < circles[i].calcArea()) {  // 원의 크기를 통한 비교
				maxArea_ = circles[i].calcArea();   // 가장 큰 원의 크기 값을 대입
				idx_ = i; 							// 가장 큰 원의 인덱스 번호 입력
			}
		}

		System.out.println("가장 큰 Circle 의 크기는 ? " + maxArea_);
		System.out.println("가장 큰 Circle 의 정보는 ? ");
		circles[idx_].output();
		System.out.println("가장 큰 Circle 의 인덱스 번호 ? " + idx_);
		
		sc.close();
	}
}
