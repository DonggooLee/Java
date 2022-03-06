package org.ddongq.ex;

public class Ex03_PrimitiveType {

	public static void main(String[] args) {
		 
		/*
		 * 기본 자료형 (Primitive Type) - c와 다르게 크기가 고정되어 있다.
		 * 
		 * 1. 정수형
		 * 	1) byte 
		 * 		(1) 크기 : 1바이트 (8비트)
		 * 		(2) 개수 : 2의 8제곱 (256개)
		 * 		(3) 범위 : -128 ~ 127 (-2의 7제곱 ~ 2의 7제곱 - 1)
		 * 	2) short
		 * 		(1) 크기 : 2바이트 (16비트)
		 * 		(2) 개수 : 2의 16제곱 (65,536개)
		 * 		(3) 범위 : -32,768 ~ 32,767 (-2의 15제곱 ~ 2의 15제곱 - 1)
		 * 	3) int
		 * 		(1) 크기 : 4바이트 (32비트)
		 * 		(2) 개수 : 2의 32제곱 (4,294,967,296개)
		 * 		(3) 범위 : -2,147,483,648 ~ 2,147,483,647 (-2의 31제곱 ~ 2의 31제곱 - 1)
		 * 	4) long
		 * 		(1) 크기 : 8바이트 (64비트)
		 * 		(2) 개수 : 2의 64제곱 (18,446,744,073,709,551,616개)
		 * 		(3) 범위 : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (-2의 63제곱 ~ 2의 63제곱 - 1)
		 * 	5) 100억 : 10000000000 처리를 정상적으로 하려면 10000000000L 이라고 표기해야 한다. (int의 범위를 벗어나는 값은 모두 접미사 L표기)
		 *  6) 만약 long형으로도 처리가 안되는 숫자는 BigIntger 클래스를 이용해서 처리한다.
		 */
		
		/*
		 * 변수 선언
		 * 1. 아무데서나 선언 할 수 있다.
		 * 2. 변수명은 첫 글자를 소문자로 하고, camel case 방식을 따른다.
		 * 		(camel case : 각 단어의 첫 글자만 대문자로 하고, 나머지는 소문자로 한다.)
		 * 		예 : myAge(O) MyAge(X)
		 * 3. 영문,숫자,언더바(_),한글(사용은 가능하지만 실제로 사용하진 않는다.)
		 */
		
		// 코드 복사 : 커서 두고 Ctrl + Atl + ↓
		// 코드 삭제 : 커서 두고 Ctrl + d
		byte var1 = 127;
		short var2 = 32767;
		int var3 = 210000;
		long var4 = 10000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		/*
		 * 1. 실수형
		 * 	1) float 
		 * 		(1) 크기 : 4바이트 
		 * 		(2) 구성 : 부호 + 지수 + 소수
		 * 		(3) 범위 : -1.4E-45 ~ (부호 : -, 지수: E-45(10의 -45제곱), 소수 :1.4)
		 * 	2) double 
		 * 		(1) 크기 : 8바이트 
		 * 		(2) 범위 : -4.0E-324 ~ 
		 * 	3) 모든 실수형은 오차가 있다.
		 */
		
		float var5 = 3.14F;		// 굳이 float을 사용하려면 숫자 뒤에 접미사 F표시
		double var6 = 3.14;
		
		System.out.println(var5);
		System.out.println(var6);
		
		/*
		 * 3. 문자형
		 * 	1) char
		 * 		(1) 크기 : 2바이트  (C언어의 char는 1바이트)
		 * 		(2) 문자의 크기 
		 * 			- 영문 : 1바이트
		 * 			- 한글 : 2바이트
		 * 	2) 코드
		 * 		(1) ASCII : 1바이트 영문 표준 코드	(C언어)
		 * 		(2) UNICODE : 2바이트 국제 표준 코드	(Java)
		 */
		
		char ch1 = 'A';
		char ch2 = '한';
		
		//int 형일 때 ASCII Code 값 반환
		//int ch_1 = 'A';		
		//int ch_2 = '한';
		//System.out.println(ch_1);
		//System.out.println(ch_2);
		
		System.out.println(ch1 + ch2); 		// 코드값을 더한 것 , 캐릭터는 +로 연결하면 숫자로 값이 나온다. 
		System.out.println(""+ch1 + ch2);	// 앞에 문자열을 붙여주면 전체 문자로 표시된다.
		System.out.println(ch1);
		System.out.println(ch2);
		
		/*
		 * 4. 논리형
		 * 	1) boolean
		 * 		(1) 참 	: true
		 * 		(2) 거짓	: false
		 *		(3) 관계 연산자, 논리 연산자의 결과 
		 */
		
		boolean isPositive;
		isPositive = true;
		if(isPositive) {
			System.out.println("양수이다!");
		}
		
		/*
		 * 5. 문자열(기본자료형은 아님!)
		 *  1)String
		 *  	(1) 참조 자료형이다.
		 *  	(2) 값을 저장하지 않고, 주소(참조)를 저장하는 자료형 (포인터)
		 *  	(3) 사용 방법
		 *  		String str1 = "Hello";
		 *  		String str2 = new String("Java"); - 일반적인 참조자료형의 사용형태
		 */
		
		String str = "Hello";
		System.out.println(str);
	}
	
}
