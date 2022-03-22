package org.ddongq.test2;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		int num1, num2, tmp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		num1 = sc.nextInt();
		
		System.out.print("점수 입력 : ");
		num2 = sc.nextInt();
		
		tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.println("출력 num1 : " +num1);
		System.out.println("출력 num2 : " +num2);
		
		sc.close();
		
	}
}
