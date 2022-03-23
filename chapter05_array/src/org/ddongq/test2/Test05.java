package org.ddongq.test2;

import java.util.Arrays;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
//		Q. int[] arr = {13, 22, -3, 92, 55, 5}
//			배열에서 값을 바꾸고 싶은 인덱스 2개를 선택하여
//			서로 값을 바꾸어 값들을 출력 (값을 바꾸는 로직 확인)
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {13, 22, -3, 92, 55, 5};
		
		System.out.print("변경할 첫 번째 인덱스 :");
		int fir = sc.nextInt();
		
		System.out.print("변경할 두 번째 인덱스 :");
		int sec = sc.nextInt();
		
		System.out.println("변경전 데이터 : " + Arrays.toString(arr));
		int tmp = 0;	// 임시 변수
		tmp = arr[fir];
		arr[fir] = arr[sec];
		arr[sec] = tmp;
				
		System.out.println("변경후 데이터 : " + Arrays.toString(arr));
		sc.close();
		
	}
}
