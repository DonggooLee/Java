package org.ddongq.test2;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키 입력 : (cm)");
		double height = sc.nextDouble();
		
		System.out.print("몸무게 입력 : (kg)");
		double weight = sc.nextDouble();

		double BMI = weight/((height/100)*(height/100));
		
		String result = (BMI>=25) ? "과체중" : (BMI>=20) ? "정상" : "저체중";
		System.out.println("체질량지수 : "+ BMI +", 결과 : "+ result);
		
		sc.close();
	}
}
