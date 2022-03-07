package org.ddongq.test;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		//Q. 길이가 10인 int형 배열 선언 후, 사용자로부터 콘솔입력 받아 값을 저장한 뒤 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		
		int[] arr = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		//입력
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+"인덱스 값 입력 : ");
			arr[i] = sc.nextInt();
			}
		
		//출력
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%3==0) {
				System.out.println(arr[i] + "는 3의 배수입니다.");
				}
		}
		
		sc.close();
	}
}
