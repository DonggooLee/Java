package org.ddongq.test;

/*
Q3. Test03.java	
나이를 입력 받아 출력하시오. 
나이가 0 ~ 150 사이의 범위를벗어나면 AgeException 클래스를 이용하여 예외를 처리하시오.
나이를 입력 받기 위해 getAge() 메소드를 이용하시오.
 */

import java.util.Scanner;

class AgeException extends Exception {
	private static final long serialVersionUID = 1L;
	// 부모인 Exception 에게 메세지를 던져주는 역할만 한다
	public AgeException(String message) {
		super(message);
	}
}

public class Test03 {
	
	static Scanner scanner = new Scanner(System.in);
	
	// 메소드 - 메인클래스에서는 static 이 필수로 붙어야한다
	public static void getAge(int age) throws AgeException {		// 메소드를 호출한 곳에서 출력해라
		if(age<0||age>150) {
			throw new AgeException("입력가능한 나이는 0~150살 입니다"); 	// 예외가 발생했을때 출력할 내용
		}
	}
	
	// 메인 메소드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 (0~150) : ");
		int age = sc.nextInt();
		
		try {
			getAge(age);
			System.out.println("당신이 입력한 나이는 " + age + "살 입니다.");
		} catch (AgeException e) {
			System.out.println("에러 메시지 : " + e.getMessage());
		} finally {
			if(sc!=null) {
				sc.close();
			}
		}
		
	}
	
}