package org.ddongq.test2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
//		Q. 1부터 입력 받은 양수 사이의 모든 정수의 합계 출력하기
//	       입력 받은 수가 2이상이 아니면 다시 입력 받도록 처리
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("숫자 입력 : ");
//		int input = sc.nextInt();
//		int sum = 0;
//		
//		if(input<2) {
//			System.out.println("다시 입력하세요");
//			int input2 = sc.nextInt();
//			for(int num=0; num<=input2; num++) {
//				sum += num;
//			}
//			System.out.println(sum);
//			
//		}else {
//			for(int num=0; num<=input; num++) {
//				sum += num;
//			}
//			System.out.println(sum);
//		}
		
		
		// 선생님 문제 풀이
		int sum = 0;
		int selNum = 0;
		
		// while 만 사용
		System.out.println("2 이상의 정수 입력 : ");
		    selNum = sc.nextInt();
		
		while(selNum<2);{
			System.out.println("2 이상의 정수 입력 : ");
			selNum = sc.nextInt();
		}
		
//		// do-while 사용
//		
//		do {
//			System.out.println("2 이상의 정수 입력 : ");
//			selNum = sc.nextInt();
//		}while(selNum<2);
		
		for(int i=1; i<=selNum; i++) {
			sum += i;
		}
		System.out.println("1부터 " + selNum + "까지의 합은 : "+ sum);
		
		sc.close();
		
	}
}
