package org.ddongq.test1;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
//		Q. 정수를 입력 받아 "짝수", "홀수" 구분해서 출력하기
//		   3의 배수는 "3의 배수"로 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0 && num % 3 == 0) {
			System.out.println("짝수이면서 3의 배수입니다.");
		}else if(num % 2 == 0) {
			System.out.println("짝수");
		}else if(num % 3 == 0) {
			System.out.println("3의 배수입니다");
		}else {
			System.out.println("홀수");
		}
		
		sc.close();
		
		
		// 짝 or 홀 && 3의 배수 (그룹화 된 if와 차이점)
		if(num%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		if(num%3==0) {
			System.out.println("3의 배수");
		}
		
		
	}
}
