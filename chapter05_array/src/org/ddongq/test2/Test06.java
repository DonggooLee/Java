package org.ddongq.test2;

public class Test06 {
	public static void main(String[] args) {
		
//		Q. Test05의 배열을 이용하여 배열 내 값들의 최소, 최대값을 출력 ★★★★ 아직 배우지는 않음
		
		int[] arr = {13, 22, -3, 92, 55, 5};
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}else if(min>arr[i]){
				min = arr[i];
			}
		}
		
		System.out.println("최댓값 : "+max);
		System.out.println("최솟값 : "+min);
		
	}
}
