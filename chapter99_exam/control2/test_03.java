package org.ddongq.control2;

import java.util.Scanner;

public class test_03 {
	public static void main(String[] args) {
		
//		Q3. 정수 두개를 입력 받아 최소, 최대, 합계를 출력
//		ex)최대:100	최소:10: 합계:110
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, sum;
		
		System.out.println("수 입력 1 : ");
		num1 = sc.nextInt();
		
		System.out.println("수 입력 2 : ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("최대 : " + num1);
			System.out.println("최소 : " + num2);
		}
		else {
			System.out.println("최대 : " + num2);
			System.out.println("최소 : " + num1);
		}
		
		sum = num1 + num2;
		
		System.out.println("합계 : " + sum);
		
		sc.close();
	}
}
