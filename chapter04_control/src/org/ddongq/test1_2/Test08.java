package org.ddongq.test1_2;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("권한 선택 :");
		int auth = sc.nextInt();
		
		switch (auth) {
		case 3:
			System.out.print("실행, ");
		case 2:
			System.out.print("쓰기, ");
		case 1:
			System.out.println("읽기");
		break;
		}
		
		sc.close();
		
	}
}
