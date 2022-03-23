package org.ddongq.test2;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
//		Q. 길이가 5인 int형 배열 선언 후, 사용자로부터 콘솔입력 받아 해당 데이터 값을 모두 더해서 합을 출력하기 
//		   - 입력 포문 더하는 포문 
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 수 입력 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];	// 입력 총합 기능 분리하는게 좋다
		}
		
		System.out.println("입력한 숫자의 총합 : "+sum);
		sc.close();
		
	}
}
