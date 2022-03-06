package org.ddongq.test1;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
//		Q. 권한을 출력하기
//		3 수준 : 실행, 쓰기, 읽기 / 2수준 : 쓰기, 읽기 / 1수준 : 읽기
//		실행 예)
//		수준입력 >> 3
//		출력 : 실행, 쓰기, 읽기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수준 입력 : ");
		int num = sc.nextInt();
		
//		switch (num) {
//			case 1 :
//				System.out.println("읽기");
//				break;
//			case 2 : 
//				System.out.println("쓰기, 읽기");
//				break;
//			case 3 : 
//				System.out.println("실행, 쓰기, 읽기");
//				break;
//		}
		
		
		// 선생님 문제풀이 (수준 권한은 큰 수부터 하는게 유리)
		switch (num) {
		case 3 : System.out.print("실행, "); // 3번을 입력했을 때 다 나오는 이유는 브레이크가 없기 때문에 쭉 내려간다. 
		case 2 : System.out.print("쓰기, ");
		case 1 : System.out.print("읽기");
			break;
		}
		
		sc.close();
		
	}
}
