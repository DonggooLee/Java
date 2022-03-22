package org.ddongq.test2_2;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
//		Q.두 정수를 입력 받아 두 정수 사이의 모든 정수의 합계 출력하기
//		    입력 순서와 무관하게 동일한 결과를 출력 
//		 	실행 예1)
//			첫 번째 정수 >> 1
//			두 번째 정수 >> 10
//			1부터 10까지 모든 정수의 합은 55입니다.
//			실행 예2)
//			첫 번째 정수 >> 10
//			두 번째 정수 >> 1
//			1부터 10까지 모든 정수의 합은 55입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		int temp;
		int sum = 0;
		
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for(int i=num1; i<=num2; i++) {
			sum += i;
		}
		
		System.out.println(num1 + "~" + num2 + "까지의 합 : " + sum);
		
		sc.close();
		
	}
}
