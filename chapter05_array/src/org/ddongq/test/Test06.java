package org.ddongq.test;

public class Test06 {
	public static void main(String[] args) {
//		Q. Test05의 배열을 이용하여 배열 내 값들의 최소, 최대값을 출력
		
		int[] arr = {13, 22, -3, 92, 55, 5};
		
		int max = arr[0]; //최대값  
		int min = arr[0]; //최소값 ★arr[0] 쓴 이유는 배열 내에서만 확인해야 하기 때문에
				
		for(int i=0; i<arr.length; i++) {
		    if(max<arr[i]) {
		    	max = arr[i];
		    }
					
		    if(min>arr[i]) {
		    	min = arr[i];
		    }
		}
				
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
	}
}
