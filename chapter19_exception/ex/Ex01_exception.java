package org.ddongq.ex;

/*
 * ArithemeticException
 * 정수를 0으로 나눌 경우 예외 발생
 */

import java.util.Scanner;

public class Ex01_exception {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		try {
			System.out.print("정수1 입력 >>");
			num1 = sc.nextInt();
			System.out.print("정수2 입력 >>");
			num2 = sc.nextInt();
			System.out.println("덧셈 결과 : " + (num1+num2));
			System.out.println("뺄셈 결과 : " + (num1-num2));
			System.out.println("곱셈 결과 : " + (num1*num2));
			System.out.println("나눗셈 결과 : " + (num1/num2));	// 예외 발생
		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다");
			e.printStackTrace();
		} finally {
//			무조건 실행되는 구간 있어도 없어도 상관 없다. 주로 객체를 닫는 역할을 많이 한다.
			if(sc != null) {
				sc.close();
			}
		}
		
	}
}
