package org.ddongq.test2;

public class Test05 {
	public static void main(String[] args) {
//		Q. 1 ~ 100 사이의 모든 정수 합계 출력하기
		
		int num = 1;
		int sum = 0;
		while (num<=100) {
			sum += num;
			num++;
		}
		System.out.println("1~100까지의 합(1) : " + sum);
		
		
		// 선생님 문제풀이
		
		int su = 0;
		for(int i = 1; i<=100; i++) {
			su += i;
//			su = su + 1; 위와 동일한 방법
		}
		System.out.println("1~100까지의 합(2) : " + su);

		// -------------------------------
//		int start = 1;
//		int end = 100;
//		int num = 0;
//		for(num=start; num<=end; num++) {
//			
//		}
		
		// 1부터 100사이의 모든 정수 중 "짝수"의 합과 "홀수"의 합을 각각 구하여 출력하시오
		int sumOdd = 0;		// 홀수 합 변수
		int sumEven = 0;	// 짝수 합 변수
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sumEven += i;
			}else {
				sumOdd += i;
			}
		}
			System.out.println("짝수의 합 : " + sumEven );
			System.out.println("홀수의 합 : " + sumOdd );
		
	}
}