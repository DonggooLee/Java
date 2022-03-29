package org.ddongq.test;

/*
Q1. Test01. java
Run - Run Configuration - arguments 를 통해 정수 2개를 전달하면 해당 정수의 사칙연산 결과를 출력하시오.
★
catch에 여러 예외처리를 할 수 있다.
ArrayIndexOutOfBoundsException : 입력을 안하거나 배열길이 이상으로 입력했을떄
ArithmeticException: / by zero : 0 이입력되었을때
NumberFormatException : 정수만 입력해야되는데 실수 입력했을때
 */

public class Test01 {
	public static void main(String[] args) {
		
		String[] arr = {"10","20"};
		
		try {
			
			// 정수변환
			int num1 = Integer.parseInt(arr[0]);
			int num2 = Integer.parseInt(arr[1]);
			
			// 사칙연산
			System.out.println("덧 셈 : " + (num1 + num2));
			System.out.println("뺄 셈 : " + (num1 - num2));
			System.out.println("곱 셈 : " + (num1 * num2));
			System.out.println("나눗셈 : " + (num1 / num2));
			
		} catch (NumberFormatException e) {

		} catch (ArithmeticException e) {

		} catch (ArrayIndexOutOfBoundsException e) {

		} catch (Exception e) {

		}
		
	}
}
