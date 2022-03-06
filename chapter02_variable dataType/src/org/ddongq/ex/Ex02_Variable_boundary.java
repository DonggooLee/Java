package org.ddongq.ex;

public class Ex02_Variable_boundary {
	
		/* 전역변수 : 모든 지역에서 사용가능
		 * 지역변수 : 코드블록({}) 내에서만 접근이 가능, 벗어나면 소멸된다.
		 * */
		
		static double PI = 3.14;	//전역 변수 선언 및 초기 값 저장
		
		public static void main(String[] args) {
			int value = 10;				//지역 변수 선언 및 초기 값 저장
			int sum = value + 20;		//지역 변수 선언 및 초기 값 저장
			
			System.out.println(sum);	//해당 메소드 내의 지역 변수 사용(O)
			System.out.println(result);	//다른 메소드 내의 지역 변수 사용(X)
			System.out.println(PI);		//해당 클래스 내의 전역 변수 사용(O)	
		}
		
		public void local() {
			int result = 100;		//지역 변수 선언 및 초기 값 저장
		}
		
	
}
