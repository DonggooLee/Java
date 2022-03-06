package org.ddongq.test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		// Test02.java
		// Q. 나이를 입력받아 "성인" 또는 "미성년자" 출력

		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력>>");
		int age = sc.nextInt();
		String adult =  (age >= 20) ? "성인" : "미성년자";
		System.out.println("당신은 " + adult + " 입니다.");
		
		sc.close();
	}
}
