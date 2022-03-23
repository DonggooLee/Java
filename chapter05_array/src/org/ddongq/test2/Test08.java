package org.ddongq.test2;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
//		Q. 성적 관리 프로그램 
//		5명의 int형 점수를 저장하는 scores 배열을 선언하고, 점수를 입력받아 최대, 최소, 평균 점수를 출력하기
//		String형 배열 names를 선언하고, 학생 5명의 이름을 초기화 한 뒤 활용
//		실행 예)
//		바트의 점수 입력 >> 70
//		리사의 점수 입력 >> 100
		
		Scanner sc = new Scanner(System.in);
		
		String[] names = new String[5];
		int[] scores = new int[5];
		

		int maxIdx = 0;
		int minIdx = 0;
		
		// 이름, 점수 입력
		for(int i=0; i<names.length; i++) {
			System.out.print("이름 입력 : ");
			names[i] = sc.next();
		}
		for(int i=0; i<scores.length; i++) {
			System.out.println(names[i] + "님의 점수 입력 : ");
			scores[i] = sc.nextInt();
		}
		
		int max = scores[0];
		int min = scores[0];
		double avg = 0;
		int sum = 0;
		
		// 최댓값, 최솟값, 평균 계산
		for(int i=0; i<scores.length; i++) {
			
			sum += scores[i];
			
			if(max<scores[i]) {
				max = scores[i];
				maxIdx = i;
			}
			if(min>scores[i]){
				min = scores[i];
				minIdx = i;
			}
			
		}
		
		avg = (double)sum/scores.length;
		
		System.out.println("최대 ("+ names[maxIdx] + ") : " + max);
		System.out.println("최소 ("+ names[minIdx] + ") : " + min);
		System.out.println("평균 : "+avg);
		
		sc.close();
		

	}
}
