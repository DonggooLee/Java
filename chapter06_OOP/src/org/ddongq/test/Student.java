package org.ddongq.test;

import java.util.Scanner;

public class Student {
	String name;
	String dept;
	String score1;
	String score2;
	double average;
	boolean isPass;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("학과 입력 : ");
		dept = sc.nextLine();
		
		System.out.print("점수1 입력 : ");
		score1 = sc.nextLine();
		double score1Dou = Double.parseDouble(score1);
		
		System.out.print("점수2 입력 : ");
		score2 = sc.nextLine();
		double score2Dou = Double.parseDouble(score2);

		average = (score1Dou + score2Dou) / 2;
//		average = Double.parseDouble(score1) + Double.parseDouble(score2) / 2.0;
		isPass = average>=80;
//		if(average>=80) {
//			isPass = true;
//		}else {
//			isPass = false;
//		}
		
		sc.close();
	}
	
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + dept);
		System.out.println("평균 : " + average + "점");
		System.out.println("합불 : " + (isPass? "합격" : "불합격"));
//		if(isPass) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
	}
	
	
}
