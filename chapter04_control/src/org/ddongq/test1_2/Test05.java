package org.ddongq.test1_2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		char input = scanner.next().charAt(0);
		System.out.println("반환된 문자 : " + input);
		
		if ( input >= 'A' && input <= 'Z') {
			System.out.println("대문자");
		}else if( input >= 'a' && input <='z') {
			System.out.println("소문자");
		}else if ( input >='0' && input <= '9') {
			System.out.println("아라비아 숫자");
		}else {
			System.out.println("일반 문자");
		}
		
		scanner.close();
		
	}
}
