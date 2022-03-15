package org.ddongq.ex;

import java.util.Scanner;

public class Ex06_Student {
	/*
	 * Ex06_Student.java
	 * 
	 *  필드
	 *  - 이름 name
	 *  - 학과 dept
	 *  - 중간 점수 score1  *String
	 *  - 기말 점수 score2	  *String
	 *  - 평균 avg
	 *  - 합격 유무 isPass
	 *  
	 *  메소드
	 *  - 이름, 학과 초기화 생성자
	 *  - 콘솔 입력을 통해 중간, 기말 점수를 입력 받는 input() 메소드
	 *  	=> 평균 및 평균 점수로 패스 유무 판단(80점 이상)
	 *  - 이름, 학과, 평균, 합or불 판단  출력 output()
	 */
	
	String name, dept, score1, score2;
	double avg;
	boolean isPass;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("중간점수 입력 : " );
		score1 = sc.next();
		double s1 = Double.parseDouble(score1);
		
		System.out.println("기말점수 입력 : " );
		score2 = sc.next();
		double s2 = Double.parseDouble(score2);
		
		avg = (s1 + s2) / 2.0;
		
		isPass = (avg >= 80 ? true : false);
		
		sc.close();
	}
	
	public Ex06_Student(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + dept);
		System.out.println("평균 : " + avg + "점");
		System.out.println("합불 : " + (isPass ? "합격" : "불합격"));
	}
	
}
