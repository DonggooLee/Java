package org.ddongq.test;

/*
Q2. Test02.java
사용자로부터 10이상의 정수를 입력 받아 난수 (0 ~ 9)로 나눈결과를 출력하시오.
위과정을 100번 반복하여 출력하며, 나눌 수없는 경우에는 나눈 결과를 0으로 대신출력한다.
 */

import java.util.Random;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int selNum, ranNum;
	
		for(int i=0; i<100; i++) {
			System.out.print("10 이상의 정수 입력 : ");
			selNum = sc.nextInt();
			ranNum = ran.nextInt(10);
			if(selNum<10) {
				// 다시 입력
				i--;
				continue;	// 없어도 됨
			}
			else {
				// 10 이상의 값 입력 = 정상
				try {
					System.out.println((i+1) + "번째 나누기 결과 : " + (selNum / ranNum));	
				} catch (ArithmeticException e) {
					System.out.println((i+1) + "번째 나누기 결과(0으로 나눈 결과) : " + 0);	
				}
			}
		}
		
		sc.close();

	}
}
