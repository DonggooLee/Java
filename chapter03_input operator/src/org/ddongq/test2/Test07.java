package org.ddongq.test2;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨 온도 입력 : ");
		double celsius = sc.nextDouble();
		double fahrenheit = celsius * 1.8 + 32;
		System.out.println("변환된 화씨 : " + fahrenheit + " ℉ ");
		
		System.out.print("화씨 온도 입력 : ");
		fahrenheit = sc.nextDouble();
		celsius = (fahrenheit - 32) / 1.8;
		System.out.println("변환된 섭씨 : " + celsius + " ℃ ");
		
		sc.close();
		
	}
}
