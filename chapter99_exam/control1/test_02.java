package org.ddongq.control1;

public class test_02 {
	public static void main(String[] args) {
		
		//Q2. 국어 99점, 영어 80점, 수학 96점의 평균 값을 실수형과 정수형으로 출력
		int kor = 99;
		int eng = 80;
		int mat = 96;
		double avg1 = (double)(kor+eng+mat)/2.0;
		int avg2 = (kor+eng+mat)/2;
		
		System.out.println("국어 :" + kor);
		System.out.println("영어 :" + eng);
		System.out.println("수학 :" + mat);
		System.out.println("평균(실수형) :" + avg1);
		System.out.println("평균(정수형) :" + avg2);
		
	}
}
