package org.ddongq.test2;

import java.util.Scanner;


public class Test05 {
	public static void main(String[] args) {
		int kor, eng, mat;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		mat = sc.nextInt();
		
		avg = (double)(kor + eng + mat) / 3.0;
		
		if(avg>=90) {
			System.out.println("A");
		}else if(avg>=80) {
			System.out.println("B");
		}else if(avg>=70) {
			System.out.println("C");
		}else if(avg>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		sc.close();
	}
}
