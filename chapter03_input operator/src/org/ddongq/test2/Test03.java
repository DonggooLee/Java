package org.ddongq.test2;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		int money;
		String grade;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("매출액 입력 : ");
		money = sc.nextInt();
		System.out.println("등급 입력 : (VIP of 일반)");
		grade = sc.next();
		
		String auth = grade.equalsIgnoreCase("VIP") ?  "실 판매 금액 : " + (int)(money*0.8) : "실 판매 금액 : " + (int)(money*0.95);
		System.out.println(auth);
		
		sc.close();
		
	}
}
