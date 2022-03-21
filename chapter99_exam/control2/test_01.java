package org.ddongq.control2;

import java.util.Scanner;

public class test_01 {
	public static void main(String[] args) {
		
//		Q1. 특정 값(정수)을 입력 받아 입력 받은 값이 3의 배수인지 아닌지를 출력
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			
			System.out.print("수 입력 : ");
			num = sc.nextInt();
			
			if(num%3==0) {
				System.out.println(num+" 은 3의 배수 입니다!");
				break;
			}
			System.out.println(num+" 은 3의 배수가 아닙니다");
			System.out.println("다시 입력하세요");
			
		}
		
		sc.close();
		
 }
}
