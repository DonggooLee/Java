package org.ddongq.ex;

public class Ex01_Variable {
	public static void main(String[] args) {
		
		// 1. 변수 선언 (선언과 초기화 동시에 진행)
		int num1 = 0;
		float num2 = 0F;
		double num3 = 0;
		char ch = 0;
		// String str = 0;		// 에러
		String str1 = null;		// null : 0번지 (주소의 초기화를 0으로 하겠다.)
		String str2 = "";		// "" :빈 문자열
		
		// 2. 값 대입
		num1 = 100;
		num2 = 1.5F;
		num3 = 1.5;
		ch = '한';
		str1 = "Hello";
		str2 = "Java";
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(ch);
		System.out.println(str1);
		System.out.println(str2);
		
		// 3. 변수의 스코프 (scope : 범위)
		//	1) 지역변수 : 코드블록({}) 내에서만 접근이 가능, 벗어나면 소멸된다.
		//	2) 전역변수 : 모든 지역에서 사용가능
		
		{
			int a = 10;
			System.out.println("코드 블록 내의 a = " + a);
		}
		// 38라인에서 이미 a 변수가 소멸 되었기 때문에 아래처럼 접근이 불가하다!
		// System.out.println("코드 블록 밖의 a = " + a);
	}
}
