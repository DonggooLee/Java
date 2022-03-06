package org.ddongq.test1;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
//		Q. 섭씨 / 화씨 변환기
//		   switch문 이용해서 구현하기
//		★화씨 = 섭씨 * 1.8 +32
//		  섭씨 = (화씨 -32) / 1.8
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("온도 변환 선택 : 1. 섭씨 -> 화씨 / 2. 화씨 -> 섭씨");
		int select = sc.nextInt();
		
		switch (select) {
			case 1 : 
				System.out.println("섭씨온도 입력 : ");
				double celsius1 = sc.nextDouble();
				double fahrenheit1 = (celsius1 * 1.8) + 32;
				System.out.println(fahrenheit1);
				break;
				
			case 2 :
				System.out.println("화씨온도 입력 : ");
				double fahrenheit2 = sc.nextDouble();
				double celsius2 = (fahrenheit2 - 32) / 1.8;
				System.out.println(celsius2);
				break;
		
		}
		
		sc.close();
		
	}
}
