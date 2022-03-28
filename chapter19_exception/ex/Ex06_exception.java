package org.ddongq.ex;

	/*
	 * throws(예외 떠넘기기)
	 * 	- 메소드를 호출한 곳으로 예외를 떠넘긴다
	 *  - 떠넘길 예외 클래스를 쉼표(,)로 구분해서 나열할 수 있다.
	 *  - throws 키워드가 붙어있는 메소드는 반드시 try 블록 내에서 호출되어야 한다.
	 *  
	 *  ** 예외가 발생한 곳에서 직접 try-catch 하지 않는 이유는
	 *  동시에 여러 개발자가 같은 메소드를 바라보고 있을 시
	 *  공용 처리보다는 throws로 각각 가져와 개별 처리를 하기 위함이다.
	 * 
	 */

public class Ex06_exception {
	
	public static void divide(int num1, int num2) throws ArithmeticException {
		// divide는 예외가 발생 할 수 있음을 알려줌
		// throws를 쓰면 예외를 main으로 던진다.
		System.out.println("몫 : " + num1/num2);
		System.out.println("나머지 : " + num1%num2);
	}
	
	public static void main(String[] args) {
		try {
			divide(5, 0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다");
		}
	}
	
}
