package org.ddongq.test;

public class Test03 {
	public static void main(String[] args) {
		//Q. Test02.java 의 값들을 모두 더하고, 총점과 평균을 출력
		
		int sum = 0;
		int[] arr = {10, 20, 50, 60, 13, 25, 97};
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double)sum / arr.length;	//length로 해주는게 변화된 값에 유리
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
}
