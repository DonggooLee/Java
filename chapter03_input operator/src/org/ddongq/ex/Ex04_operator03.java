package org.ddongq.ex;

public class Ex04_operator03 {
	public static void main(String[] args) {

		/*
		 * 5. 관계 연산자(비교 연산자)
		 *  1) >= : 이상, 크거나 같다.
		 *  2)  > : 초과, 크다.
		 *  3) <= : 이하, 작거나 같다.
		 *  4)  < : 미만, 작다.
		 *  5) == : 같다. (기본 자료형)
		 *     .equals() : 같다. (문자열 비교)
		 *  6) != : 같지 않다.
		 *   ! .equals() : 같지 않다. (문자열 비교)	
		 *  
		 * 6. 논리 연산자
		 *  1) && : and 연산
		 *  2) || :  or 연산 
		 *  3) !  : not 연산
		 *  4) short evaluate 를 지원
		 *   	- && : false가 나오면 그 이후는 처리 하지 않음 (어차피 false라서)★
		 *   	- || : true가 나오면 그 이후는 처리 하지 않음 (어차피 true라서)★
		 *   
		 * 7. 조건 연산자
		 *	1) (조건식) ? 조건식이 true인 경우 : 조건식이 false인 경우
		 *	2) if else문의 대용으로 사용된다.  
		 */
				
		int a = 10;
		System.out.println(a == 10 && a < 100);		// true
		System.out.println(a != 10 || a == 10);		// true
		System.out.println(!(a==10));				// false
		
		int b = 10;
		boolean result = (a == 100) && (++b > 10);	
		// result : false
		// b : 10  -> short evaluate, 앞에 (a == 100) 가 이미 false 이므로, (++b > 10) 는 확인도 안함!
		System.out.println(" result : " + result + ", b : " + b);
		
		int age = 18;
		boolean isAdult = (age >= 20) ? true : false;
		int fee = isAdult ? 4000 : 2000;
		System.out.println("요금 : " + fee);
				
		String id = "admin";
		String auth = id.equals("admin") ? "인증성공" : "인증실패";
		//String auth = "admin".equals(id) ? "인증성공" : "인증실패"; -> 동작은 하지만 사용하지 않는다!
		System.out.println(auth);
	}
}
