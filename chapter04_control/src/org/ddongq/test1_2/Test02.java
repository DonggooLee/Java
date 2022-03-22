package org.ddongq.test1_2;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("필기 점수 입력 : ");
		int num1 = scanner.nextInt();
		
		System.out.print("실기 점수 입력 : ");
		int num2 = scanner.nextInt();
		
		double avg = (num1+ num2) / 2.0;
		
		if((num1>=70&&num2>=70)||avg>=80) {
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}
		
		scanner.close();
		
	}
}
