package org.ddongq.control2;

public class test_07 {
	public static void main(String[] args) {
		
//		Q7. 피보나치 수열은 앞의 두 수를 더해서 다음 수를 만들어나가는 수열이다.
//		예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고
//		그 다음 수는 1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21...과 같은 식으로 진행된다. 
//		1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하시오.
		
		// 피보나치 수열 초기값 설정
		int num1 = 1; 
		int num2 = 1; 
		int result = 0; // 10번째 최종 값 집어넣을 변수
		
		System.out.print(num1 + " " + num2 + " ");
		for(int i=0; i<8; i++) {
			result = num1 + num2;
			num1 = num2;
			num2 = result;
			System.out.print(result+" ");
		}
		
		System.out.print("피보나치 수열의 10번 재 수 : " + result);
	}
}
