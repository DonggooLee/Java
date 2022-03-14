package org.ddongq.test;

public class TestOper {
	double val1, val2;
	
	// 입력 메소드
	void plus(double _val1, double _val2) {
		val1 = _val1;
		val2 = _val2;
		System.out.println("더하기 : " + (val1+val2));
		// void 타입은 리턴이 불가능
	}
	
	void minus() {
		System.out.println("빼기 : " + (val1-val2));
	}
	
	void multi() {
		System.out.println("곱하기 : " + (val1*val2));
	}
	
	double div() {
		return val1 / val2;
	}

	void output() {
		System.out.println("나누기 : " + div());
	}
	

}
