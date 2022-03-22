package org.ddongq.test2_2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
//		Q. 1부터 입력 받은 양수 사이의 모든 정수의 합계 출력하기 입력 받은 수가 2이상이 아니면 다시 입력 받도록 처리
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.println("1부터 입력한 수까지의 총 합 : "+sum);
		
		sc.close();
		
	}
}
