package org.ddongq.test2;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별 입력(1~4) >>");
		int num = sc.nextInt();
		
		String gender =  (num % 2 == 1) ? "남자" : "여자";
		System.out.println("성별은 " + gender + " 입니다.");
		
		
		sc.close();
	}
}
