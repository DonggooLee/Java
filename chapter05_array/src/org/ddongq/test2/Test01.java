package org.ddongq.test2;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
//		Q. 임의의 정수값 5개를 저장한 배열 중에서 인덱스가 1인 곳의 값을 출력
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"번째 수 입력 : " );
			num[i] = sc.nextInt();
		}
		System.out.println("인덱스 값 1인 곳의 값 : "+num[1]);
		sc.close();
		
	}
}
