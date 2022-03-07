package org.ddongq.test;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		/*
		Q. 성적 관리 프로그램 
		5명의 int형 점수를 저장하는 scores 배열을 선언하고, 점수를 입력받아 최대, 최소, 평균 점수를 출력하기
		String형 배열 names를 선언하고, 학생 5명의 이름을 초기화 한 뒤 활용
		실행 예)
			바트의 점수 입력 >> 70
			리사의 점수 입력 >> 100 
		1. 크기 5짜리 int형 배열 scores 선언
		2. scores에 점수 입력
		3. scores 배열의 최대, 최소, 평균 구하기
		4. 크기 5짜리 String형 배열 names 생성과 동시에 값 적용	
		*/
		
		Scanner sc = new Scanner(System.in);
		
		String names[] = {"바트","리사","철수","짱구","맹구"}; // 초기화
		int scores[] = new int[5];
		
		String highest = names[0];	// 최고 점수를 받은 학생 이름
		String lowest = names[0];	// 최저 점수를 받은 학생 이름
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(names[i] + "님의 점수 입력 : ");
			scores[i] = sc.nextInt();
		}
		
		int max = scores[0];
		int min = scores[0];
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			if(max<=scores[i]) {
				max = scores[i];
				highest = names[i];
			}
			if(min>=scores[i]) {
				min = scores[i];
				lowest = names[i];
			}
			sum += scores[i];
		}
		
		double avg = (double)sum / scores.length;
		
		System.out.println("최대 ("+ highest + ") : " + max);
		System.out.println("최소 ("+ lowest + ") : " + min);
		System.out.println("평균 : "+avg);
		
		sc.close();
	
	}	
}
