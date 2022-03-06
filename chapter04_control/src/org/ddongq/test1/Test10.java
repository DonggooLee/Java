package org.ddongq.test1;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
//		Q. Test04.java 을 switch 문으로 다시풀기
//		점수를 입력 받아 학점 출력하기
//	    100 ~ 97점 : A+ / 96 ~ 94점 : A0 / 93 ~ 90점 : A- 
//	    89 ~ 87점 : B+ / 86 ~ 84점 : B0 / 83 ~ 80점 : B-
//	    79 ~ 77점 : C+ / 76 ~ 74점 : C0 / 73 ~ 70점 : C- / 69 ~ 0점 : F

		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		char grade, point = 0 ; // 초기화
		
		
		switch(score % 10) { // 1의 자리
			case 0 : case 1 : case 2 : case 3 : point = '-'; // 동일한 행동은 동일한 케이스로 묶는다.
				break;
			case 4 : case 5 : case 6 : point = '0';
				break;
			case 7 : case 8 : case 9 : point = '+';
		}
		
		
		switch (score / 10) { // 10의 자리
			case 10: grade = '+';
			case 9: grade = 'A';
				break;
			case 8: grade = 'B';
				break;
			case 7: grade = 'C';
				break;
			default : grade = 'F'; point = ' ';
		}
			
		
		sc.close();
	}
}
