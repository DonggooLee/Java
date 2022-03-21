package org.ddongq.array;

import java.util.Arrays;

public class test_01 {
	public static void main(String[] args) {
		
//		Q1. 배열의 크기가 10인 배열을 선언하고 1~10까지 순서대로 값을 넣은 후 배열과 배열의 값의 합을 출력
		
		int[] arr = new int[10];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			sum += arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("배열전체 요소의 합 : " + sum);
		
		
		// 선생님 문제풀이
		int[] num = new int[10];
		int sum2 = 0;
		
		// 값 입력
		for(int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
		
		// 값 출력
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
			sum2 += num[i];
		}
		System.out.println("\n배열전체 요소의 합 : " + sum2);
		
	}
}
