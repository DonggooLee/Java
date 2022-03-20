package org.ddongq.ex;

import java.util.Scanner;

public class Ex02_Student {
	/*
	 * 필드
	 *  - 이름 name
	 *  - 학과 dept
	 *  - 중간점수 score1 (String)
	 *  - 기말점수 score2 (String)
	 *  - 평균 avg
	 *  - 합격 여부 isPass
	 *  
	 * 메소드
	 *  - 생성자
	 *  - input() => 2개의 점수 입력 받아서 평균/합격 여부 구하기
	 *  - getAvg ()= > 평균값 리턴
	 *  - isPass() => 합격여부 리턴
	 *  - output()
	 */
	
	private String name, dept, score1, score2;
	private double avg;
	private boolean isPass;
	
	// 생성자
	public Ex02_Student() {
	}
	public Ex02_Student(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	// 메소드
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 점수 입력 : ");
		score1 = sc.next();
		System.out.print("기말 점수 입력 : ");
		score2 = sc.next();
		avg = getAvg();
		isPass = isPass();
		sc.close();
	}
	
	private double getAvg() {
		return (Double.parseDouble(score1)+Double.parseDouble(score2)) / 2.0;
	}
	
	private boolean isPass() {
		return (avg>=80 ? true : false);
	}
	
	public void output() {
		System.out.println("이름 : " + name );
		System.out.println("학과 : " + dept );
		System.out.println("평균 : " + avg );
		System.out.println("합격? : " + (isPass() ? "합격" : "불합격"));
	}
	
}
