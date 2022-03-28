package org.ddongq.ex;

/*
 * NumberFormatException
 * 주어진 문자열을 정수 및 실수로 변환하지 못할 경우 예외 발생
 */

public class Ex03_exception {
	public static void main(String[] args) {

		String data1 = "100";
		String data2 = "a100";
		
		int val1;
		int val2;
		
		// 값을 변환하여 출력
		// 예외 발생 시 발생하는 위치 주석
		// 예외 처리 방법 -> "문자열을 숫자로 변환할 수 없다!" 출력
		
		try {
			val1 = Integer.parseInt(data1);
			System.out.println(val1);
			val2 = Integer.parseInt(data2);
			System.out.println(val2);
		} catch (NumberFormatException e) {
			System.out.println("문자열을 숫자로 변환할 수 없다!");
		}
		
	}
}
