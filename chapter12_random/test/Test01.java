package org.ddongq.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		/*
		임의의 값 6개(중복 제거), 입력받는 값 6개를 비교하여 맞는 개수와 해당 번호를 출력
		로또 및 선택 번호는 1 ~ 45 사이의 값
		
		1. 임의의 값 6를 배열에 담는다 (랜덤이용)
		2. 내가 선택한 값 6개를 배열에 담는다 (스캐너 이용)
		*/
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		// 임의의 값 6개 담기 (1~45)
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (ran.nextInt(45)+1);
			// 중복제거 : 현재 index (i) 와 (0 ~ i-1) 비교하여 중복된 숫자가 존재하면 i--
			for(int j=0; j<i; j++) {			
				if(lotto[i] == lotto[j]) {
					i--;				
				}
			}
		}
		
		// 내가 선택한 값 6개 담기
		int[] choice = new int[6];
		for(int i=0;i<choice.length;i++) {
			System.out.print((i+1)+"번째 숫자 입력(1~45): ");
			choice[i] = sc.nextInt();
		}
		
		// lotto 및 choice 값, 일치하는 수 출력
		System.out.println("* * * * 로또 번호 * * * *");
		System.out.println(Arrays.toString(lotto));
		System.out.println("------------------------");
		System.out.println("* * * * 선택 번호 * * * *");
		System.out.println(Arrays.toString(choice));
		System.out.println("------------------------");
		
		int count = 0;
		String ckStr = "";
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<choice.length;j++) {
				if(lotto[i] == choice[j]) {
//					System.out.println("맞은 번호 : "+ lotto[i]);
					count++;
					ckStr += Integer.toString(lotto[i]) + " ";
				}
			}
		}
		System.out.println("일치하는 숫자의 총 개수는 ? "+count+"개");
		System.out.println("맞은 번호 : " + ckStr);
		
		sc.close();
	}
}
