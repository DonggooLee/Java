package org.ddongq.test;

public class TestOperMain {
	/*
	 * 필드
	 * - double val1, val2
	 * 
	 * 메소드
	 * - void plus(double, double)
	 * - void minus()
	 * - void multi()
	 * - double div()
	 * 
	 * 위 내용을 이용하여
	 * TestOperMain에서 2개의 값을 이용하여
	 * 더하기,빼기,곱하기,나누기 의 값을 출력
	 * 
	 */
	public static void main(String[] args) {
		TestOper test = new TestOper();
		test.plus(10.3, 3.5);
		test.minus();
		test.multi();
		test.output();
		
		// 초기화 단계 (선생님 문제 풀이)
		test.val1 = 100;
		test.val1 = 200;
		
		test.plus(100, 200);
		test.minus();
		test.multi();
		System.out.println(test.div()); //val1 / val2 의 값이 리턴되어 옴
		
		
	}
	
}
