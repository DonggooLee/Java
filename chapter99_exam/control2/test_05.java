package org.ddongq.control2;

import java.util.Scanner;

public class test_05 {
	public static void main(String[] args) {
		
		/*
		Q5. 점수(정수)를 입력 받아 해당 점수가
		90점 이상이면 A학점
		80점 이상이면 B학점
		70점 이상이면 C학점
		60점 이상이면 D학점
		60점 미만은 F학점
		이 외에 점수를 입력했을 때에는 "정상 데이터가 아닙니다." 출력
		*/
		
		int num = 0;
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		num = sc.nextInt();
		
		if(num>=90) {
			grade = 'A';
		}else if(num>=80) {
			grade = 'B';
		}else if(num>=70) {
			grade = 'C';
		}else if(num>=60) {
			grade = 'D';
		}else if(num<60) {
			grade = 'F';
		}else{
			grade = 'Z';
		}
		
		if(grade=='Z')
			System.out.println("정상 데이터가 아닙니다.");
		else
			System.out.println("학점은 : " + grade + "입니다.");
		
		sc.close();
	}
}
