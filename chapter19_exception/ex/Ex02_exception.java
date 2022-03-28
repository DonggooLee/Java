package org.ddongq.ex;

/*
 * ArrayIndexOutOfBoundsException
 * 배열에서 인덱스 범위를 벗어난 경우 예외 발생
 */

public class Ex02_exception {
	public static void main(String[] args) {
		
		// 1. 예외 발생 위치 주석으로 달기
		// 2. 위 내용에서 예외 발생 시 "인덱스 가용 범위를 벗어났습니다" 출력
		int[] arr = new int[3];
		
		try {
			arr[1] = 8;
			arr[2] = 6;
//			arr[3] = 3;	// 예외 발생
			for(int n : arr) {
				System.out.println(n);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 가용 범위를 벗어났습니다");
		}
		
	}
}
