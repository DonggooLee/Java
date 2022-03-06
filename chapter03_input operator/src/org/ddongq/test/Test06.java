package org.ddongq.test;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {

		// Test06.java
		// Q. 하이픈 없이 주민등록번호를 입력받아 (정수, 문자열) "남자","여자" 출력하기
		
		Scanner scanner = new Scanner(System.in);
		// 문자열 풀이
		
		/*
		System.out.print("주민등록 번호 입력>>");
		String num = scanner.next(); 
		
		//String gender = ( num.charAt(6) == '1') ? "남자" : "여자"; 
		String gender = (num.substring(6,7).equals("1")) ? "남자" : "여자";
		
		System.out.println("성별 : " + gender);
		*/
		
		
		/* 정수 풀이*/
		
		System.out.print("주민등록 번호 입력>>");
		double sn = scanner.nextDouble();
		
		double genderNum = sn / 1000000 % 10;
		System.out.println(sn / 1000000);		//데이터 확인
		System.out.println(sn / 1000000 % 10);
		 
		String gender = (int)genderNum % 2 == 0? "여자" : "남자";
		System.out.println(gender);
		
		
		scanner.close();
				
	}
}
