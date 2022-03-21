package org.ddongq.control1;

import java.util.Scanner;

public class test_03 {
	public static void main(String[] args) {
		
//		Q3 .사용자에게 값을 입력받은 후 그 값이 숫자인지 아닌지를 출력
//		* 아스키 코드표 참고
		
		char input;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		input = sc.next().charAt(0);
		
		if(input>=48 && input<=57) {
			System.out.println("숫자 입니다");
		}else {
			System.out.println("숫자가 아닙니다");
		}
		
		sc.close();
		
	}
}
