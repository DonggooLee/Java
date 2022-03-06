package org.ddongq.test;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {

		// Test03.java
		// Q. 매출액과 등급("VIP","일반")을 입력받아 등급이 "VIP"이면 매출액에서 20%를 할인하고
		//	  "일반"이면 매출액에서 5%를 할인하는 프로그램 구현 

		Scanner sc = new Scanner(System.in);
		System.out.print("매출액 입력>>");
		
		int salesMoney = sc.nextInt();
		System.out.print("등급 입력>>");
		
		String grade = sc.next();
		
		String auth = grade.equalsIgnoreCase("VIP") ?  "실 판매 금액 : " + (int)(salesMoney*0.8) : "실 판매 금액 : " + (int)(salesMoney*0.95);
		// .equalsIgnoreCase = 대소문자 구별안함
		System.out.println(auth);
		
		// double earn = grade.equalsIgnoreCase("VIP") ?  salesMoney*0.8 : salesMoney*0.95;
		// System.out.println("실제 매출 : " +(int)earn);
		
		sc.close(); 
	}
}
