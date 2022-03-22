package org.ddongq.test1_2;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = scanner.nextInt();
		if(age<=7) {
			System.out.println("미취학");
		}else if(age<=13) {
			System.out.println("초둥학생");
		}else if(age<=16) {
			System.out.println("중학생");
		}else if(age<=19) {
			System.out.println("고등학생");
		}else{
			System.out.println("성인");
		}
		
		scanner.close();
		
	}
}
