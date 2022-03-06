package org.ddongq.test2;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
//		Q.두 정수를 입력 받아 두 정수 사이의 모든 정수의 합계 출력하기
//	    입력 순서와 무관하게 동일한 결과를 출력 
//	 	실행 예1)
//		첫 번째 정수 >> 1
//		두 번째 정수 >> 10
//		1부터 10까지 모든 정수의 합은 55입니다.
//		실행 예2)
//		첫 번째 정수 >> 10
//		두 번째 정수 >> 1
//		1부터 10까지 모든 정수의 합은 55입니다.
		
		Scanner sc = new Scanner(System.in);
		
//		int sum = 0;
//		int input1, input2 = 0;
//		
//		
//		System.out.println("첫 번째 정수 : ");
//		input1 = sc.nextInt();
//		
//		System.out.println("두 번째 정수 : ");
//		input2 = sc.nextInt();
//	
//		
//		if(input1<input2) {
//			while(input1<=input2){
//				sum += input1;
//				input1++;
//			}
//			System.out.println("두 수의 합은 ? " + sum);
//		}else {
//			while(input2<=input1){
//				sum += input2;
//				input2++;
//			}
//			System.out.println("두 수의 합은 ? " + sum);
//		}
		
		
		// 선생님 문제풀이
		int start = 0;		// 시작 값
		int end = 0;		// 종료 값
		int sum = 0;		// 총합
		int temp;			// 임시 변수
		
		// 1. 입력
		System.err.println("첫번째 정수 입력 : ");
		start = sc.nextInt();
		
		System.err.println("두번째 정수 입력 : ");
		end = sc.nextInt();
		
		// 2. start와 end 크기 비교
		// 항상 start <= end
		// start > end 상황일 때 두 변수의 값을 교환 
		if(start>end) {
			temp = start;
			start = end;
			end = temp;
		}
		
		for(int i=start; i<=end; i++) {
			sum += i;
		}
		
		System.out.println(start + "~" + end + "까지의 합 : " + sum);
		
		sc.close();
		
	}
}
