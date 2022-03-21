package org.ddongq.control2;

import java.util.Arrays;

public class test_10 {
	public static void main(String[] args) {
		
//		Q10. 피보나치 수열 20개를 출력
//		ex) 1, 1, 2, 3, 5, 8, 13, 21, ...
		
		// 피보나치 수열 초기값 선언
		int num1 = 1; 
		int num2 = 1; 
		int result = 0;
		
		// 배열 초기화
		int arr[] = new int[20];
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i=0; i<18; i++) {
			result = num1 + num2;
			num1 = num2;
			num2 = result;
			arr[i+2] = num2;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		// 선생님 문제풀이
		int[] fibo = new int[20];
		fibo[0] = 1;
		fibo[1] = 1;
		
		for(int i=2; i<fibo.length; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		
		String result2 = "";
		
		for(int i : fibo) {
			result2 += i + ", ";
			//System.out.print(i + ", ");
		}
		result2 = result2.substring(0, result2.length()-2); // 마지막 에서 ", " <- 2글자 제외
		
		System.out.println(result2);
	}
}
