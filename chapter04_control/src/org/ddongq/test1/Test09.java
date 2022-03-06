package org.ddongq.test1;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
//		Q. 월을 입력 받아 일을 출력하기
//		실행 예)
//		월 입력 >> 10
//		출력 : 10월은 31일 까지 있습니다.
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("월 입력 : ");
//		int num = sc.nextInt();
//		
//		switch (num) {
//		case 1 :
//			System.out.println("01월은 31일 까지 있습니다");
//			break;
//		case 2 :
//			System.out.println("02월은 28일 까지 있습니다");
//			break;
//		case 3 :
//			System.out.println("03월은 31일 까지 있습니다");
//			break;
//		case 4 :
//			System.out.println("04월은 30일 까지 있습니다");
//			break;
//		case 5 :
//			System.out.println("05월은 31일 까지 있습니다");
//			break;
//		case 6 :
//			System.out.println("06월은 30일 까지 있습니다");
//			break;
//		case 7 :
//			System.out.println("07월은 31일 까지 있습니다");
//			break;
//		case 8 :
//			System.out.println("08월은 31일 까지 있습니다");
//			break;
//		case 9 :
//			System.out.println("09월은 30일 까지 있습니다");
//			break;
//		case 10 :
//			System.out.println("10월은 31일 까지 있습니다");
//			break;
//		case 11 :
//			System.out.println("11월은 30일 까지 있습니다");
//			break;
//		case 12 :
//			System.out.println("12월은 31일 까지 있습니다");
//			break;
//		}
		
		
		// 선생님 문제풀이
		
		System.out.println("월입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
			case 2: System.out.println(month+"월은 28일 까지 있습니다.");
				break;
			case 4: case 6: case 9: case 11: System.out.println(month+"월은 30일 까지 있습니다.");
				break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: System.out.println(month+"월은 31일 까지 있습니다.");
				break;
		}
		
		
		sc.close();
	}
}
