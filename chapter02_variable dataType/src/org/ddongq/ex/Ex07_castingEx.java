package org.ddongq.ex;

public class Ex07_castingEx {
	public static void main(String[] args) {

		// 1. 줄 바꿈
		System.out.println();

		// 2. 숫자끼리 + 연산자 : 산술연산자
		System.out.println(1 + 1);
		System.out.println(1.5 + 1);

		// 3. 문자열끼리 + 연산자 : 연결연산자
		System.out.println("Hello " + "Java");

		// 4. 숫자와 문자열 + 연산자 : 연결 연산자 (순서대로 진행된다.)
		System.out.println(100 + "원");
		System.out.println(100 + 100 + "원");
		System.out.println("$" + 100);
		System.out.println("$" + 100 + 100); // 문자열이 먼저 나오면 뒤에 숫자도 문자열로 인식된다.

	}
}
