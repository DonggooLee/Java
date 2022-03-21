package org.ddongq.control2;

public class test_09 {
	public static void main(String[] args) {
		
//		Q9. 배열 int[] arr = {1,2,3,5,6} 의 값 중에 최대 값, 전체 합, 평균 값 출력하기

		
		int[] arr = {1,2,3,5,6};
		int sum = 0;
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			sum += arr[i];
			
			if(max<arr[i]) {
				max = arr[i];
			}
			
		}
		
		System.out.println("최대 값 : " + max);
		System.out.println("전체 합 : " + sum);
		System.out.println("전체 평균 : " + (double)sum/arr.length);
		
	}
}
