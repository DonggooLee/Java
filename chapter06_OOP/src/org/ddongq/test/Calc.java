package org.ddongq.test;

class CalcManager {
	
	int num1, num2;
			  // 매개변수
	void init(int a, int b) {	// 입력 메소드
		num1 = a; // num1 = 10;
		num2 = b; // num2 = 20;
	}
	
	void info() {	// 출력 메소드
		System.out.println("합계 : "+ plus());
	}
	
	// 계산 메소드
	int plus() {
		return num1 + num2;
	}
	
}

public class Calc {
	public static void main(String[] args) {
		
		// 2개의 값을 더해서 출력하는 프로그램
		CalcManager c = new CalcManager();
			   // 파라매터
		c.init(10,20); // 메소드 호출과 함께 입력해준다
		c.info();
		
	}
}
