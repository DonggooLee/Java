package org.ddongq.ex;

public class Ex07_exception {
	
	public static void divide(int num1, int num2) throws ArithmeticException {
		// divide는 예외가 발생 할 수 있음을 알려줌
		// throws를 쓰면 예외를 main으로 던진다.
		System.out.println("몫 : " + num1/num2);
		System.out.println("나머지 : " + num1%num2);
	}
	
	public static void main(String[] args) throws ArithmeticException {
			divide(5, 2);
			divide(5, 0);
	}
	
}
