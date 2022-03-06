package org.ddongq.test;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {

		// Test05.java
		// Q. 국,영,수 점수를 입력받아 평균과 학점 출력하기 
		//평균값이 90이상이면 'A", 80이상이면 'B', 70이상이면 'C', 60이상이면 'D', 이하는 'F'
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 >>");
		int kor = sc.nextInt();
		System.out.print("영어 점수 >>");
		int eng = sc.nextInt();
		System.out.print("수학 점수 >>");
		int mat = sc.nextInt();
		
		double ave = (kor+eng+mat) / 3.0;
		
		char grade = ave >= 90 ? 'A' : 
						ave >= 80 ?'B' : 
							ave >= 70 ? 'C' : 
								ave >= 60 ? 'D' : 'F';
		
		System.out.println("평균 점수 : " + ave + " 학점 : "+ grade);
		
		/* char grade 대신 if를 쓴다면...
		if (ave >= 90) {
			System.out.println("A학점");
		}else if (ave >= 80){
			System.out.println("B학점");
		}else if (ave >= 70){
			System.out.println("C학점");
		}else if (ave >= 60){
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		*/
		
		sc.close();
			
	}
}
