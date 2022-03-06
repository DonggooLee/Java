package org.ddongq.test2;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
//		Q.Up-Down 게임
//		1 ~ 100 사이에서 임의의 숫자를 하나 결정한 뒤
//		해당 숫자를 맞추는 게임
//		입력 받은 숫자의 크기에 따라 "Up!", "Down!", "Answer!" 로 나눠서 출력하고
//		맞출때까지 몇 번 진행했는지 횟수도 함께 출력
//		실행 예)
//		입력 >> 30
//		Up!
//		입력 >> 40
//		Down!
//		입력 >> 35
//		Down!
//		입력 >> 33
//		Answer!
//		총 4회만에 성공!
		
		Scanner sc = new Scanner(System.in);
		int answer = 76;
		int count = 0; //초기화가 안정성에 좋음
		
		while(true) {
			System.out.print("1~100 까지의 숫자 입력 : ");
			int input = sc.nextInt();
			// count++; << 여기다 한번 하는게 깔끔
			
			if(answer > input) {
				System.out.println("Up");
				count++;
			}else if(answer < input){
				System.out.println("Down");
				count++;
			}else {
				System.out.println("Answer!");
				count++;
				break;
			}
		}
			System.out.println("총 " + count +"회만에 성공!");
			
		sc.close();
	}
}
