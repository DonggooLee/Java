package org.ddongq.test2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		double num1;
		String num2;
		Scanner sc = new Scanner(System.in);
		
		// 문자열 문제풀이
		System.out.println("주민번호 입력 : ");
		num2 = sc.next();
		//String gender = ( num.charAt(6) == '1') ? "남자" : "여자"; 
		String gender = (num2.substring(6,7).equals("1")) ? "남자" : "여자";
		System.out.println("성별 : " + gender);
		
		// 정수형 문제풀이
		System.out.println("주민번호 입력 : ");
		num1 = sc.nextDouble();
		double sn = num1 / 1000000 % 10;
		String gender_ = (int)sn%2==0 ? "여자":"남자";
		System.out.println("성별 : "+ gender_);
		
		sc.close();
	}
}
