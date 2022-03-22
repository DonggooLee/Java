package org.ddongq.test1_2;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int num = scanner.nextInt();
		
		if(num % 2 == 0 && num % 3 == 0) {
			System.out.println("짝수이면서 3의 배수입니다.");
		}else if(num % 2 == 0) {
			System.out.println("짝수");
		}else if(num % 3 == 0) {
			System.out.println("3의 배수입니다");
		}else {
			System.out.println("홀수");
		}
		
		scanner.close();
		
	}
}
