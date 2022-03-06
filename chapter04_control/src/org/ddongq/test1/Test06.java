package org.ddongq.test1;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
//		Q. 알파벳을 하나 입력 받아 대문자가 입력되면 소문자로 변환해서 출력하고, 소문자가 입력되면 대문자로 변환해서 출력하고
//	   	나머지 문자들은 그대로 출력하기
//	   	★아스키 코드  97~122 : 소문자, 65~90 : 대문자, 48~57 : 숫자
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력 : ");
		char input = sc.next().charAt(0);
//		int num = input;
//		
//		if(num>=97 & num<123) {
//			System.out.println("대문자");
//		}else if(num>=65 & num<90){
//			System.out.println("소문자");
//		}else if(num>=48 & num<57){
//			System.out.println("숫자");
//		}
		

		// 선생님 문제 풀이
		if(input>='A' && input<='Z') {
			System.out.println(input+=32);
		}else if(input>='a' && input<='z') {
			System.out.println(input-=32);
		}

		sc.close();

		
		
		
	}
}
