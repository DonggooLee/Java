package org.ddongq.test2;

public class Test03 {
	public static void main(String[] args) {
		
//		Q. Test02.java 의 값들을 모두 더하고, 총점과 평균을 출력
		int arr[] = {10, 20, 50, 60, 13, 25, 97};
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		avg = (double)sum/arr.length;
		
		System.out.println("총점 : "+ sum);
		System.out.println("평균 : "+ avg);
	
	}
}
