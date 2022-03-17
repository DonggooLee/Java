package org.ddongq.test;

public class TestOper {
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
	
	// 필드
	double val1, val2;
	
	// 입력 + 더하기 메소드
	void plus(double _val1, double _val2) {
		val1 = _val1;
		val2 = _val2;
		System.out.println("더하기 : " + (val1+val2));
	}
	
	// 빼기 메소드
	void minus() {
		System.out.println("빼기 : " + (val1-val2));
	}
	
	// 곱하기 메소드
	void multi() {
		System.out.println("곱하기 : " + (val1*val2));
	}
	
	// 나누기 메소드
	double div() {
		return val1 / val2; 	// void 타입은 리턴이 불가능 차이점 중요!
	}
	
	// 출력 메소드
	void output() {
		System.out.println("나누기 : " + div());
	}

}
