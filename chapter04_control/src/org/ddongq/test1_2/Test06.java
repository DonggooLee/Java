package org.ddongq.test1_2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		char input = scanner.next().charAt(0);
		System.out.println("반환된 문자 : " + input);
		
		if(input>='A' && input<='Z') {
			System.out.println(input+=32);
		}else if(input>='a' && input<='z') {
			System.out.println(input-=32);
		}
		
		scanner.close();
		
	}
}
