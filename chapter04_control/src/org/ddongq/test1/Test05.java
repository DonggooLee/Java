package org.ddongq.test1;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
//		Q. 문자를 하나 입력 받아 "대문자", "소문자", "아라비아 숫자", "일반 문자" 구분해서 출력하기
//	       아스키 코드표 참고 Ch2_Ex04_String
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력 : ");
		char input = sc.next().charAt(0);
		int num = input;

		if(num>=123) {
			System.out.println("일반 문자");
		}else if(num>=97){
			System.out.println("소문자");
		}else if(num>=91){
			System.out.println("일반 문자");
		}else if(num>=65){
			System.out.println("대문자");
		}else if(num>=58){
			System.out.println("일반 문자");
		}else if(num>=48){
			System.out.println("아라비아 숫자");
		}else if(num>=32){
			System.out.println("일반문자");
		}
		
		sc.close();
		
		
		// 선생님 문제풀이
		
		
	}
}
