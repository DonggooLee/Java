package org.ddongq.ex;

import java.util.Scanner;

public class Ex01_input {
	public static void main(String[] args) {
		/*
		 * 1. Scanner 클래스
		 * 
		 *  1) console창을 통한 입력
		 *  
		 *  2) java.util.Scanner 클래스로 존재
		 *  	(1) java.util.Scanner 로 사용
		 *  	(2) import 후 사용
		 *  		import 대상 : java.lang 이외의 모든 클래스
		 *  
		 *  3) Scanner 클래스의 객체 생성 방법
		 *  	Scanner 객체명 = new Scanner(입력스트림);
		 *  
		 *  4) Scanner 클래스의 객체 소멸 방법
		 *  	객체명.close();
		 *  
		 *  5) Scanner 클래스의 메소드
		 *  	(1) 문자열 입력
		 *  		- next() : 공백 전까지 입력
		 *  		- nextLine() : 엔터 전까지 입력
		 *  	(2) 정수 입력
		 *  		- nextInt(), nextByte(), nextShort(), nextLong()
		 *  	(3) 실수 입력
		 *  		- nextDouble(), nextFloat()
		 *  	(4) 논리 이력
		 *  		- nextBoolean()
		 *  	(5) 문자 입력
		 *  		- 문자열 입력(next(),nextLine()) 받은 뒤 첫번째 값(charAt(0))만 사용
		 *  		ex) String s = "happy"; -> s.charAt(0) == 'h'
		 */
		
		// 성명, 나이, 키, 성별 입력 받아 출력하기
		
		// 1. Scanner 객체 (인스턴스)생성
//		java.util.Scanner scanner = new java.util.Scanner(System.in);	//import(X)
		Scanner scanner = new Scanner(System.in);						//import(O)
		
		// 2. 입력
		System.out.println("성명 입력>>");
		String name = scanner.nextLine();
		
		System.out.print("나이 입력>>");
		int age = scanner.nextInt();
		
		System.out.print("키 입력>>");
		double height = scanner.nextDouble();
		
		scanner.nextLine(); // nextInt, nextDouble에 개행문자 삭제
		System.out.println("성별 입력>>");
		String gender = scanner.nextLine();
		
		//3. 출력
		System.out.println("성명 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("성별 : " + gender);
		
		//4. Scanner 객체(인스턴스) 소멸
		scanner.close();
	}
}
