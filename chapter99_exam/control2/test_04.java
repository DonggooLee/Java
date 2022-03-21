package org.ddongq.control2;

import java.util.Scanner;

public class test_04 {
	public static void main(String[] args) {
		
//		Q4. 총 4개의 과목 성적을 입력하여 평균이 60점 이하면 과락, 60점 이상이면 합격을 출력
//		* 배열을 이용
		
		Scanner sc = new Scanner(System.in);
		
		int[] Cor = new int[4];
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<Cor.length; i++) {
			System.out.print((i+1) + "번째 점수 입력 :");
			Cor[i] = sc.nextInt();
			sum += Cor[i];
		}
		
		avg = (double)sum/4.0;
		
		System.out.println("총합 :" + sum);
		System.out.println("평균 :" + avg);
		
		if(avg>=60) {
			System.out.println("합격");
		}else {
			System.out.println("과락");
		}
		
		sc.close();
			
	}
}
