package org.ddongq.test1;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
//		Q. 필기와 실기 점수를 입력 받아 합격 유무 출력하기
//		합격기준: 필기와 실기 점수 모두 70점 이상이거나, 평균이 80 이상시 "합격" 아니면 "불합격"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("필기 점수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println("실기 점수 입력 : ");
		int num2 = sc.nextInt();
		
		double avg = (num1 + num2) / 2.0;
		
		if((num1 >= 70 && num2 >= 70) || avg >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		sc.close();
		
		
		// 1. 논리식 사용X
		if (num1>=70){
			if(num2>=70) {
				System.out.println("합격");
			}
		}else if(avg>=80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
	}
}
