package org.ddongq.test;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {

		// Test07.java
		// Q. 섭씨 화씨 변환기
		//	  섭씨를 입력하면 변환된 화씨, 화씨를 입력하면 변환된 섭씨 출력하기
		//    화씨 = 섭씨 * 1.8 +32
		//    섭씨 = (화씨 -32) / 1.8
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("섭씨 입력>>");
		double celsius = scanner.nextDouble();
		double fahrenheit = celsius* 1.8 + 32;
		System.out.println("변환된 화씨 : " + fahrenheit + " ℉ ");
		
		System.out.print("화씨 입력>>");
		fahrenheit = scanner.nextDouble();
		celsius = (fahrenheit - 32) / 1.8;
		System.out.println("변환된 섭씨 : " + celsius + " ℃ ");
		 
		scanner.close();		
	}
}
