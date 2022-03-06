package org.ddongq.ex;

public class Ex05_for {
	public static void main(String[] args) {
		/*
		 * 1. 형식
		 * 		
		 * 		for(초기문; 조건문; 반복실행문 후 실행){
		 * 			반복실행문;
		 * 		}
		 * 
		 * 2. 특징
		 *  1) 반복의 횟수 또는 범위가 명확한 경우에 사용하는 반복문이다.
		 *  2) 주로 배열과 함께 사용된다.
		 *  3) 무한루프는 for( ; ; ){} 과 같은 형식으로 사용한다. (초기문, 조건문, 반복실행문 후 실행을 다 비워놓는다.)
		 *  4) 반복실행문이 없는 경우엔 for(초기문; 조건문; 반복실행문 후 실행); 과 같은 형식으로 사용한다.
		 */
		
			//지역변수	   //조건문  //순서 : 1. 초기문 2. 조건문 3. 출력 4. 반복실행 후 실행
		for(int num=0; num<10; num++) { 		// 변수를 for문 안에서 선언&초기화 해도 된다.
			System.out.println(num);
		}  										// int num이 소멸되는 지점(for문을 벗어나면 num은 사용 불가 ★)
		// System.out.println(num);				// main 스코프에서 선언된 num이 없으므로 에러!
		
		// for 문을 이용해서 0~10 화면 출력 (지역변수 i 사용)
		// for 문마다 동일한 변수를 선언해도 무방하다.
		for(int i=0; i<11; i++) {
			System.out.println(i);
		}
		// 위 for 문 아래 for 문의 각 i는 다른 i이다.
		
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				
			}
		}
		
		
		// 2중 for 문(별찍기)
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		// 2중 for 문(왼쪽 삼각형)
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		// 2중 for 문(오른쪽 삼각형)		
		for(int i=1; i<6; i++) {
			for(int j=5; j>0; j--) {
				if(j > i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}
