package org.ddongq.control2;

public class test_08 {
	public static void main(String[] args) {
		
//		Q8. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오
//		int[][] arr = {
//				{5, 5, 5, 5, 5},
//				{10, 10, 10, 10, 10},
//				{20, 20, 20, 20, 20},
//				{30, 30, 30, 30, 30}
//				};
		
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {			// 4번 돈다
			for(int j=0; j<arr[i].length; j++) {	// 5번 돈다
				sum += arr[i][j];
			}
		}
		
		System.out.println("배열의 총 합은 ? " + sum);
		
	}
}
