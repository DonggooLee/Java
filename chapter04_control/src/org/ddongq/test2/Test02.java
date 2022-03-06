package org.ddongq.test2;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
//		Q. 입력받은 구구단만 출력하기
//		ex) 4X1=4
//			4X2=8
//			4X3=12
//			4X4=16
//			...
		
		 // 선생님 문제풀이 (for문)
		 Scanner sc = new Scanner(System.in);
		 System.out.println("단수 입력 : ex. 1단 -> 1 ");
		 int dan = sc.nextInt();
		 
		 for(int i = 1; i<=9; i++) {
			 System.out.println(dan + "X" + i + "=" + (dan*i));
		 }
		 
		 // while 문으로 변환
		 int j = 1;
		 while(j<=9) {
			 System.out.println(dan + "X" + j + "=" + (dan*j));
			 j++;
		 }
		
		 sc.close();
		 
	}
}
