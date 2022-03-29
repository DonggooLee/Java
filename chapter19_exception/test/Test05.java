package org.ddongq.test;

import java.util.InputMismatchException;

/*
Q5. Test05.java		
Up-Down 게임
1 ~ 100 사이의 난수를 발생시켜 해당 값을 맞출때까지 게임을 진행하시오.
다음의 경우 예외를 발생시키시오.
1) 사용자가 1 ~ 100 이외의 값을 입력한 경우
2) 정수대신 다른 데이터 (예: 실수, 문자) 등을 입력한 경우	
*/

import java.util.Scanner;

class NumberOutOfBoundsException extends Exception {
	private static final long serialVersionUID = 1L;
	public NumberOutOfBoundsException(String msg) {
		super(msg);
	}
}

class UpDown {
	
	private int answer;
	private int count;
	private Scanner sc = new Scanner(System.in);
	
	public UpDown() {
		
		answer = (int)((Math.random()*100)+1);		// 메스랜덤은 기본형태로 실수이기 때문에 100 곱하고 형변환
		
	}

	public void play() {
		
		while(true) {
			try {
				int user = challenge();
				
				if(user>answer) {
					System.out.println("Down");
				}else if(user<answer){
					System.out.println("Up");
				}else {
					System.out.println("정답 : " + answer + "(" + count + "회 만에 성공)");
					break;
				}
				
			} catch (NumberOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("정수만 입력하세요");
				sc.next();	// 버퍼 비우는 용도
			}
		}
		
	}
	
	public int challenge() throws NumberOutOfBoundsException, InputMismatchException {
		
		count++;
		System.out.print("1~100 사이의 정수 입력 : ");
		int selNum = sc.nextInt();
		if(selNum<1||selNum>100) {
			throw new NumberOutOfBoundsException("1~100 사이의 정수를 입력하세요");
		}
		return selNum;
		
	}
	
}

public class Test05 {
	public static void main(String[] args) {
		
		UpDown ud = new UpDown();
		ud.play();
		
	}
}
