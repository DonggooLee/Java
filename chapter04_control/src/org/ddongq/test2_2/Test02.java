package org.ddongq.test2_2;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
//		Test02.java
//		Q. 입력받은 구구단만 출력하기
//		ex) 4X1=4
//			4X2=8
//			4X3=12
//			4X4=16
//			...
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 수 입력 : (2~9단)");
		int num = sc.nextInt();
		
		for (int i=1; i<10; i++) {
			System.out.println(num+" X "+i+" = "+num*i);
		}
		
		System.out.println("-------------------");
		
		int j=1;
		while(j<10) {
			System.out.println(num+" X "+j+" = "+num*j);
			j++;
		}
		
		sc.close();
		
	}
}
