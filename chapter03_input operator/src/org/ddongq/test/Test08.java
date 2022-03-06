package org.ddongq.test;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {

		// Test08.java
		// Q. 체질량 지수(BMI) = 몸무게(kg) / 키 (m) 제곱 
		// 	  BMI 25 이상이면 "과체중", 20 이상이면 "정상", 20 미만이면 "저체중"
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("키 입력>>");
		double height = scanner.nextDouble();
		height = height / 100; 		// 키(cm) -> 키(m)로 변환
		
		System.out.print("몸무게(kg) 입력>>");
		double weight = scanner.nextDouble();
				
		double bmi = weight / (height*height) ;
						
		String overWeight = bmi >= 25 ? "과체중" : bmi >= 20 ? "정상" : "저체중";
		System.out.println("체질량 지수 : " + bmi + " 체중 범위 : " + overWeight );
		
		scanner.close();
	}
}
